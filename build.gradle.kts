
buildscript {
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
    kotlin("kapt") version "1.9.20"
}