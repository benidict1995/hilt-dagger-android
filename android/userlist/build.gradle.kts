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

    viewBinding{
        isEnabled = true
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
    implementation (project(":android:core"))

    implementation (Dependencies.KOTLIN)
    implementation (Dependencies.ANDROIDX_CORE)
    implementation (Dependencies.ANDROIDX_APPCOMPAT)
    implementation (Dependencies.ANDROIDX_MATERIAL)
    implementation (Dependencies.ANDROIDX_FRAGMENT)
    implementation (Dependencies.ANDROIDX_CONSTRAINT)

    implementation (Dependencies.ANDROIDX_NAV_FRAGMENT)
    implementation (Dependencies.ANDROIDX_NAV_UI)

    implementation (Dependencies.ANDROIDX_LIFECYCLE_LIVEDATA)
    implementation (Dependencies.ANDROIDX_COROUTINE)

    implementation (Dependencies.EPOXY)
    kapt (Dependencies.EPOXY_PROCESSOR)

    implementation (Dependencies.CIRCULAR_IMAGE_VIEW)

    implementation (Dependencies.GLIDE)
    kapt (Dependencies.GLIDE_COMPILER)

    implementation (Dependencies.HILT_DAGGER)
    implementation (Dependencies.HILT_LIFECYCLE_VIEWMODEL)
    kapt (Dependencies.HILT_ANDROID_COMPILER)
    kapt (Dependencies.HILT_COMPILER)

    testImplementation (Dependencies.TestDependencies.JUNIT)
    androidTestImplementation (Dependencies.TestDependencies.EXT_JUNIT)
    androidTestImplementation (Dependencies.TestDependencies.ESPRESSO)
}