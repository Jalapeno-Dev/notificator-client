plugins {
    `kotlin-dsl`
}

group = "com.jalapeno.jalapenonotificator.buildlogic"


java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApp") {
            id = "com.jalapenonotificator.android.application"
            implementationClass = "AndroidAppConventionPlugin"
        }
        register("androidLibrary") {
            id = "com.jalapenonotificator.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidFeature") {
            id = "com.jalapenonotificator.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        register("androidLint") {
            id = "com.jalapenonotificator.android.lint"
            implementationClass = "AndroidLintConventionPlugin"
        }
        register("androidAppCompose") {
            id = "com.jalapenonotificator.android.application.compose"
            implementationClass = "AndroidAppComposeConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "com.jalapenonotificator.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("jvmLibrary") {
            id = "com.jalapenonotificator.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("androidHilt") {
            id = "com.jalapenonotificator.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
    }
}