plugins {
    kotlin("jvm") version "1.6.10"
    id("com.apollographql.apollo3") version "3.2.2"
}

group = "org.example"
version = "1.0.0-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
}


dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime", "3.2.2")
}

apollo {
    packageName.set("com.example")
}
