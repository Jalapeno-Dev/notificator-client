import Version.AndroidX.core as coreVersion
import Version.AndroidX.lifecycle as lifecycleVersion
import Version.AndroidX.activityCompose as activityComposeVersion
import Version.AndroidX.composeBom as composeBomVersion
import Version.AndroidX.androidJunit as androidJunitVersion
import Version.AndroidX.androidEspresso as androidEspressoVersion
import Version.JUnit.junit as junitVersion


object Library {

    object AndroidX {
        val core: String
            get() = "androidx.core:core-ktx:$coreVersion"

        val lifecycle: String
            get() = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"

        val activityCompose: String
            get() = "androidx.activity:activity-compose:$activityComposeVersion"

        val composeBom: String
            get() = "androidx.compose:compose-bom:$composeBomVersion"

        val composePrimitives: String
            get() = "androidx.compose.ui:ui"

        val composeGraphics: String
            get() = "androidx.compose.ui:ui-graphics"

        val composePreview: String
            get() = "androidx.compose.ui:ui-tooling-preview"

        val composeMaterial3: String
            get() = "androidx.compose.material3:material3"

        val androidJunit: String
            get() = "androidx.test.ext:junit:$androidJunitVersion"

        val androidEspresso: String
            get() = "androidx.test.espresso:espresso-core:$androidEspressoVersion"

        val composeJunit4: String
            get() = "androidx.compose.ui:ui-test-junit4"

        val composeTooling: String
            get() = "androidx.compose.ui:ui-tooling"

        val composeDebug: String
            get() = "androidx.compose.ui:ui-test-manifest"
    }

    object JUnit {
        val junit: String
            get() = "junit:junit:$junitVersion"
    }

}
