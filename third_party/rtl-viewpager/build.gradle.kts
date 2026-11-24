plugins {
    alias(libs.plugins.androidLibrary)
}

android {
    namespace = "com.duolingo.open.rtlviewpager"
    compileSdk = 34
    defaultConfig { minSdk = 14 }
}

dependencies {
    api("androidx.viewpager:viewpager:1.0.0")
}
