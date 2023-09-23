import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.jalapenonotificator.android.library")
                apply("com.jalapenonotificator.android.hilt")
            }
            TODO("Not yet implemented")
        }
    }
}