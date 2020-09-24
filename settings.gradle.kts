include(":dependency")
include(":user")

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        mavenLocal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.jetbrains.dokka") {
                useModule("org.jetbrains.dokka:dokka-gradle-plugin:${requested.version}")
            }
        }
    }
}

