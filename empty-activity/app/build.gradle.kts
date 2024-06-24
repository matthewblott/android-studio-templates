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
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = "1.5.3"
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
  implementation("androidx.activity:activity-compose:1.9.0")
  implementation("androidx.appcompat:appcompat:1.7.0")
  implementation("androidx.browser:browser:1.8.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
  implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
//  implementation("com.google.android.material:material:1.12.0")
  implementation("androidx.compose.material3:material3:1.2.1")
}

repositories {
  google()
  mavenCentral()
}
