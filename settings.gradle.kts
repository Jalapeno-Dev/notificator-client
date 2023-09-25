pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "jalapenonotificator"
include(":app")
include(":feature:chat")
include(":feature:robot")
include(":feature:authentication")
include(":feature:onboarding")
include(":core:designsystem")
include(":core:database")
include(":core:data:chatcache")
include(":core:domain:chat")
include(":core:domain:robot")
