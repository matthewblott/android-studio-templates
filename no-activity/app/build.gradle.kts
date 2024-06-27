plugins {
  id("com.android.application") version "8.4.2"
  id("org.jetbrains.kotlin.android") version "1.9.0"
  id("org.jetbrains.kotlin.plugin.serialization") version "1.9.10"
}

buildscript {
  repositories {
    google()
    mavenCentral()
  }

}

android {
  namespace = "com.example.app"
  compileSdk = 34

  defaultConfig {
    minSdk = 34
  }

  buildFeatures {
    viewBinding = true
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_18.toString()
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_18
    targetCompatibility = JavaVersion.VERSION_18
  }

}

dependencies {
//   implementation(libs.androidx.core.ktx)
//   implementation(libs.androidx.appcompat)
//   implementation(libs.material)
//   testImplementation(libs.junit)
//   androidTestImplementation(libs.androidx.junit)
//   androidTestImplementation(libs.androidx.espresso.core)
  implementation("androidx.appcompat:appcompat:1.7.0")
  implementation("androidx.browser:browser:1.8.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
  implementation("com.google.android.material:material:1.12.0")
  implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
  implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
}

repositories {
  google()
  mavenCentral()
}
