plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-kapt")
    id ("kotlinx-serialization")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion (30)
    buildToolsVersion ("30.0.2")

    defaultConfig {
        applicationId =  "com.benidict.hilt_dagger_android"
        minSdkVersion (16)
        targetSdkVersion (30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    viewBinding{
        isEnabled = true
    }


    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            consumerProguardFiles("consumer-rules.pro")
        }
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

    implementation (project(":data"))
    implementation (project(":domain"))
    implementation (project(":network"))
    implementation (project(":android:core"))
    implementation (project(":android:userlist"))

    implementation (Dependencies.KOTLIN)
    implementation (Dependencies.ANDROIDX_CORE)
    implementation (Dependencies.ANDROIDX_APPCOMPAT)
    implementation (Dependencies.ANDROIDX_MATERIAL)
    implementation (Dependencies.ANDROIDX_FRAGMENT)
    implementation (Dependencies.ANDROIDX_CONSTRAINT)

    implementation (Dependencies.ANDROIDX_NAV_FRAGMENT)
    implementation (Dependencies.ANDROIDX_NAV_UI)

    implementation (Dependencies.RETROFIT)
    implementation (Dependencies.RETROFIT_SERIALIZER)
    implementation (Dependencies.OKHTTP)
    implementation (Dependencies.OKHTTP_INTERCEPTOR)

    implementation (Dependencies.ANDROIDX_LIFECYCLE_LIVEDATA)
    implementation (Dependencies.ANDROIDX_COROUTINE)

    implementation (Dependencies.HILT_DAGGER)
    kapt (Dependencies.HILT_ANDROID_COMPILER)
    implementation (Dependencies.HILT_LIFECYCLE_VIEWMODEL)
    kapt (Dependencies.HILT_COMPILER)

    testImplementation (Dependencies.TestDependencies.JUNIT)
    androidTestImplementation (Dependencies.TestDependencies.EXT_JUNIT)
    androidTestImplementation (Dependencies.TestDependencies.ESPRESSO)

}