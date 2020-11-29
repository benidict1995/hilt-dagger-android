import Versions.appcompatVersion
import Versions.circularImageViewVersion
import Versions.coreVersion
import Versions.kotlinVersion
import Versions.materialVersion
import Versions.junitVersion
import Versions.extJunitVersion
import Versions.espresso
import Versions.fragmentVersion
import Versions.hiltDaggerVersion
import Versions.hiltDaggerViewModelVersion
import Versions.constraintVersion
import Versions.coroutineVersion
import Versions.epoxyVersion
import Versions.glideVersion
import Versions.lifecycleLiveDataVersion
import Versions.navigationVersion
import Versions.okhttpVersion
import Versions.retrofitSerializerVersion
import Versions.retrofitVersion

object Versions{
    const val kotlinVersion = "1.4.0"
    const val coreVersion = "1.3.1"
    const val appcompatVersion = "1.2.0"
    const val materialVersion = "1.2.1"
    const val fragmentVersion = "1.2.5"
    const val constraintVersion = "2.0.4"
    const val navigationVersion = "2.3.0"

    const val circularImageViewVersion = "3.1.0"

    const val glideVersion = "4.11.0"

    const val lifecycleLiveDataVersion = "2.2.0"

    const val coroutineVersion = "1.3.9"
    
    const val retrofitVersion = "2.9.0"
    const val retrofitSerializerVersion = "0.6.0"

    const val okhttpVersion = "4.8.1"

    const val epoxyVersion = "3.9.0"

    const val hiltDaggerVersion = "2.28-alpha"
    const val hiltDaggerViewModelVersion = "1.0.0-alpha02"

    const val junitVersion = "4.+"
    const val extJunitVersion = "1.1.2"
    const val espresso = "3.3.0"
}


object Dependencies{
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val ANDROIDX_CORE = "androidx.core:core-ktx:$coreVersion"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:$appcompatVersion"
    const val ANDROIDX_MATERIAL = "com.google.android.material:material:$materialVersion"
    const val ANDROIDX_FRAGMENT = "androidx.fragment:fragment-ktx:$fragmentVersion"
    const val ANDROIDX_CONSTRAINT = "androidx.constraintlayout:constraintlayout:$constraintVersion"

    const val CIRCULAR_IMAGE_VIEW = "de.hdodenhof:circleimageview:$circularImageViewVersion"

    const val GLIDE = "com.github.bumptech.glide:glide:$glideVersion"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:$glideVersion"

    const val ANDROIDX_LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleLiveDataVersion"

    const val ANDROIDX_COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val RETROFIT_SERIALIZER = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:$retrofitSerializerVersion"

    const val OKHTTP = "com.squareup.okhttp3:okhttp:$okhttpVersion"
    const val OKHTTP_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"

    const val EPOXY = "com.airbnb.android:epoxy:$epoxyVersion"
    const val EPOXY_PROCESSOR ="com.airbnb.android:epoxy-processor:$epoxyVersion"

    const val ANDROIDX_NAV_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
    const val ANDROIDX_NAV_UI = "androidx.navigation:navigation-ui-ktx:$navigationVersion"

    const val HILT_DAGGER = "com.google.dagger:hilt-android:$hiltDaggerVersion"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:$hiltDaggerVersion"
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:$hiltDaggerViewModelVersion"
    const val HILT_LIFECYCLE_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltDaggerViewModelVersion"


    object TestDependencies{
        const val JUNIT = "junit:junit:$junitVersion"
        const val EXT_JUNIT = "androidx.test.ext:junit:$extJunitVersion"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:$espresso"
    }
}