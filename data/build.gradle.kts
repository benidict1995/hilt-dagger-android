plugins {
    id ("com.android.library")
    id ("kotlin-android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion (30)

    defaultConfig {
        minSdkVersion (16)
        targetSdkVersion (30)


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions{
        this.jvmTarget = "1.8"
    }
}

dependencies {

    implementation (project(":domain"))
    implementation (project(":network"))

    implementation (Dependencies.KOTLIN)

    implementation (Dependencies.ANDROIDX_COROUTINE)
    implementation (Dependencies.RETROFIT)

    implementation (Dependencies.HILT_DAGGER)
    kapt (Dependencies.HILT_ANDROID_COMPILER)

    testImplementation (Dependencies.TestDependencies.JUNIT)
    androidTestImplementation (Dependencies.TestDependencies.EXT_JUNIT)
    androidTestImplementation (Dependencies.TestDependencies.ESPRESSO)
}