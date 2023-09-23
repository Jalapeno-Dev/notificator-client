package com.jalapeno.jalapenonotificator

enum class BuildType (val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE,
}