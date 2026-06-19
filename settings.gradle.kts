rootProject.name = "podima-game-api"

dependencyResolutionManagement {

    repositories {
        maven { url = uri("https://maven.myket.ir") }

        maven("https://mirror-maven.runflare.com/maven2/")
        maven("https://mirror-maven.runflare.com/android/maven2/")
        // If you have a mirror for Gradle Plugin Portal:
        maven("https://mirror-maven.runflare.com/gradle-plugins/")
    }
}

pluginManagement {

    repositories {
        maven { url = uri("https://maven.myket.ir") }

        maven("https://mirror-maven.runflare.com/gradle-plugins/")
        maven("https://mirror-maven.runflare.com/maven2/")
        // Fallback only if needed – but avoid default repos
    }
}
