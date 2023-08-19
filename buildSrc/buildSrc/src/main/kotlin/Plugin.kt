import Version.Android.agp as agpVersion
import Version.KotlinX.kgp as kgpVersion


object Plugin {

    object Android {
        val agp: String
            get() = "com.android.tools.build:gradle:$agpVersion"
    }

    object KotlinX {
        val kgp: String
            get() = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kgpVersion"
    }

}
