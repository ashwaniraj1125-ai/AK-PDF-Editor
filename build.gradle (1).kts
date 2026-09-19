plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.ak.pdfeditor"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.ak.pdfeditor"
        minSdk = 23
        targetSdk = 35
        versionCode = 2
        versionName = "2.0"
    }
}
dependencies {
    implementation("com.tom-roush:pdfbox-android:2.0.27.2")
}
