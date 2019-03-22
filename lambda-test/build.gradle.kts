plugins {
    kotlin("jvm").version("1.3.21")
    id("com.github.johnrengelman.shadow").version("5.0.0")
}

dependencies {
    implementation(project(":model"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.amazonaws:aws-lambda-java-core:1.2.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.skyscreamer:jsonassert")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks {
    val test by getting(Test::class) {
        useJUnitPlatform()
    }
}
