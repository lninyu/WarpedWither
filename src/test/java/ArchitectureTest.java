import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArchitectureTest {
    private static final JavaClasses CLASSES = new ClassFileImporter().importPackages("me.lninyu.warpedWither");

    @Test
    @DisplayName("Must not use NMS in any form")
    public void mustNotUseNMS() {
        denyAccessToPackage("net.minecraft..");
        denyImportOfPackage("net.minecraft..");
    }

    @Test
    @DisplayName("Must not use CraftBukkit internals in any form")
    public void mustNotUseCraftBukkit() {
        denyAccessToPackage("org.bukkit.craftbukkit..");
        denyImportOfPackage("org.bukkit.craftbukkit..");
    }

    private static void denyAccessToPackage(String packageIdentifier) {
        ArchRuleDefinition.noClasses()
            .should()
            .accessClassesThat()
            .resideInAPackage(packageIdentifier)
            .because("Accessing forbidden package (%s)".formatted(packageIdentifier))
            .check(CLASSES);
    }

    private static void denyImportOfPackage(String packageIdentifier) {
        ArchRuleDefinition.noClasses()
            .should()
            .dependOnClassesThat()
            .resideInAPackage(packageIdentifier)
            .because("Depending on forbidden package (%s)".formatted(packageIdentifier))
            .check(CLASSES);
    }
}
