package plugin


import Application
import com.android.build.gradle.AppExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.plugin.extraProperties


class AppModulePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        applyPlugins(project)

        applyAppExtension(project)
    }

    private fun applyPlugins(project: Project) {
        project.plugins.apply {
            apply("com.android.application")
            apply("kotlin-android")
            apply("kotlin-kapt")
        }
    }

    private fun applyAppExtension(project: Project) {
        val extension = project.extensions.getByName("android")
                as? BaseAppModuleExtension ?: return
        extension.apply {
            namespace = "com.jalapeno.notificator"
            compileSdk = Application.compileSdk

            defaultConfig {
                applicationId = Application.id
                minSdk = Application.minSdk
                targetSdk = Application.targetSdk
                versionCode = Application.versionCode
                versionName = Application.versionName

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                vectorDrawables {
                    useSupportLibrary = true
                }
            }

            buildTypes {
                named("debug") {
                    applicationIdSuffix = ".debug"
                    versionNameSuffix = "-debug"

                    isMinifyEnabled = false
                    enableUnitTestCoverage = true

                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }

                named("release") {
                    isDebuggable = false
                    isMinifyEnabled = true
                    isShrinkResources = true

                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }
            }

            sourceSets {
                named("main") {
                    java {
                        srcDir("src/main/kotlin")
                    }
                }

                named("debug") {
                    java {
                        srcDir("src/debug/kotlin")
                    }
                }
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }

            buildFeatures.apply {
                compose = true
            }

            composeOptions {
                kotlinCompilerExtensionVersion = "1.5.1"
            }

            packagingOptions {
                resources {
                    excludes += "/META-INF/{AL2.0,LGPL2.1}"
                }
            }
        }
    }
}
