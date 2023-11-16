plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":emulair-app-common"))
    implementation(deps.libs.retrofit)
    implementation(deps.libs.kotlinxCoroutinesAndroid)

    implementation(deps.libs.androidx.appcompat.appcompat)
    implementation(deps.libs.androidx.appcompat.constraintLayout)
    implementation(deps.libs.material)
    implementation("androidx.documentfile:documentfile:1.0.1")
}
