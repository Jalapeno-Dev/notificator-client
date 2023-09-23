import com.android.build.api.dsl.ApplicationExtension
import com.jalapeno.jalapenonotificator.configureCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidAppComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
            configureCompose(extensions.getByType<ApplicationExtension>())
        }
    }
}
