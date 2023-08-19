import Plugin.Android.agp as androidGradlePlugin
import Plugin.KotlinX.kgp as kotlinGradlePlugin

plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("appPlugin") {
            id = "appPlugin"
            implementationClass = "plugin.AppModulePlugin"
        }
    }
}

kotlin {
    sourceSets {
        named("main") {
            kotlin.apply {
                srcDir("buildSrc/src/main/kotlin")
            }
        }
    }
}

dependencies {
    // Android
    implementation(androidGradlePlugin)

    // KotlinX
    implementation(kotlinGradlePlugin)
}

repositories {
    google()
    mavenCentral()
}
