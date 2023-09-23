import com.jalapeno.jalapenonotificator.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

class JvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
                apply("com.jalapenonotificator.android.lint")
            }
            configureKotlinJvm()
        }
    }
}