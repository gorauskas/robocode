plugins {
    id("net.sf.robocode.java-conventions")
    `java-library`
}

dependencies {
    implementation(project(":robocode.api"))
}

description = "Robocode Samples"

java {
    withJavadocJar()
    withSourcesJar()
}

tasks {
    val copyContent by registering(Copy::class) {
        from("src/main/resources") {
            include("**/*.*")
        }
        from("src/main/java") {
            include("**")
        }
        into("../.sandbox/robots")
    }

    val copyClasses by registering(Copy::class) {
        from(compileJava)
        into("../.sandbox/robots")
    }

    javadoc {
        source = sourceSets["main"].java
        include("**/*.java")
    }

    jar {
        dependsOn(copyContent)
        dependsOn(copyClasses)
        dependsOn(javadoc)

        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        from("src/main/java") {
            include("**")
        }
        from("src/main/resources") {
            include("**")
        }
    }
}