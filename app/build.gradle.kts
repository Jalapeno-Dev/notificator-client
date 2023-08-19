plugins {
    id("appPlugin")
}

dependencies {

    implementation(Library.AndroidX.core)
    implementation(Library.AndroidX.lifecycle)
    implementation(Library.AndroidX.activityCompose)
    implementation(platform(Library.AndroidX.composeBom))
    implementation(Library.AndroidX.composePrimitives)
    implementation(Library.AndroidX.composeGraphics)
    implementation(Library.AndroidX.composePreview)
    implementation(Library.AndroidX.composeMaterial3)
    testImplementation(Library.JUnit.junit)
    androidTestImplementation(Library.AndroidX.androidJunit)
    androidTestImplementation(Library.AndroidX.androidEspresso)
    androidTestImplementation(platform(Library.AndroidX.composeBom))
    androidTestImplementation(Library.AndroidX.composeJunit4)
    debugImplementation(Library.AndroidX.composeTooling)
    debugImplementation(Library.AndroidX.composeDebug)
}