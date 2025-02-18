plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.manager.appbanhang"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.manager.appbanhang"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    //RxJava
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation ("io.reactivex.rxjava3:rxjava:3.0.0")
    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")
    //badge
    implementation ("com.nex3z:notification-badge:1.0.4")
    //eventbus
    implementation("org.greenrobot:eventbus:3.3.1")
    //paper
    implementation("io.github.pilgr:paperdb:2.7.2")
    //google
    implementation ("com.google.code.gson:gson:2.11.0")
    //lottie
    implementation ("com.airbnb.android:lottie-compose:6.4.1")
    //neumorphism
    implementation ("com.github.fornewid:neumorphism:0.3.2")
}