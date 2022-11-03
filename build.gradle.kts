plugins {
    java
    id("com.apollographql.apollo3") version "3.7.0-SNAPSHOT"
    application
}

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
}


dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime-java")
    implementation("com.apollographql.apollo3", "apollo-rx3-support-java")
}

apollo {
    packageName.set("com.example")
    generateKotlinModels.set(false)
}

application {
    mainClass.set("com.example.Main")
}

// `./gradlew downloadApolloSchema --endpoint='https://apollo-fullstack-tutorial.herokuapp.com/graphql' --schema=`pwd`/src/main/graphql/schema.graphqls` to download the schema
// `./gradlew run` to run the app
