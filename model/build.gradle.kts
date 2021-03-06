import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    `java-library`
    jacoco
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.skyscreamer:jsonassert")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

jacoco {
    toolVersion = "0.8.2"
}

bintray {
    publish = true
    setPublications("main")
    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "maven"
        name = "${project.group}:${project.name}"
        setLicenses("LGPL-3.0")
        vcsUrl = "https://gitlab.com/madhead/lambda-proxy-integration-java"
        version(delegateClosureOf<BintrayExtension.VersionConfig> {
            name = project.version.toString()
        })
    })
}

tasks {
    val test by getting(Test::class) {
        useJUnitPlatform()
    }

    val jacocoTestReport by getting(JacocoReport::class) {
        reports {
            xml.setEnabled(true)
        }
    }

    val sourcesJar by creating(Jar::class) {
        from(sourceSets["main"].allJava)
        classifier = "sources"
    }

    val javadocJar by creating(Jar::class) {
        val javadoc by tasks

        from(javadoc)
        classifier = "javadoc"
    }
}

publishing {
    publications {
        val main by creating(MavenPublication::class) {
            from(components["java"])

            val sourcesJar by tasks
            val javadocJar by tasks

            artifact(sourcesJar)
            artifact(javadocJar)
        }
    }
}
