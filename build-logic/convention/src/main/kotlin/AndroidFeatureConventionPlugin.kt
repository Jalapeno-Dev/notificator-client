import com.jalapeno.jalapenonotificator.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.jalapenonotificator.android.library")
                apply("com.jalapenonotificator.android.hilt")
            }
        }
    }
}