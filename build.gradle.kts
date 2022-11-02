plugins {
    java
    id("com.apollographql.apollo3") version "3.6.0"
    application
}

allprojects {
    repositories {
//        mavenLocal()
        google()
        mavenCentral()
    }
}


dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")
    implementation("com.apollographql.apollo3", "apollo-rx3-support")
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
