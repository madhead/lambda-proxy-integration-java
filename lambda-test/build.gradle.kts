import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import com.github.jengelman.gradle.plugins.shadow.transformers.Log4j2PluginsCacheFileTransformer

plugins {
    kotlin("jvm").version("1.3.21")
    id("com.github.johnrengelman.shadow").version("5.0.0")
}

dependencies {
    implementation(platform("org.apache.logging.log4j:log4j-bom:2.11.1"))
    implementation(platform("com.fasterxml.jackson:jackson-bom:2.9.8"))

    implementation(project(":model"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.amazonaws:aws-lambda-java-core:1.2.0")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("org.apache.logging.log4j:log4j-core")
    implementation("com.amazonaws:aws-lambda-java-log4j2:1.1.0")

    testImplementation(platform("org.junit:junit-bom:5.4.0"))
    testRuntimeOnly(platform("org.junit:junit-bom:5.4.0"))

    testImplementation(platform("com.fasterxml.jackson.module:jackson-module-kotlin"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("io.ktor:ktor-client-cio:1.1.3")
    testImplementation("io.ktor:ktor-client-jackson:1.1.3")
    testImplementation("io.ktor:ktor-client-logging:1.1.3")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks {
    val test by getting(Test::class) {
        useJUnitPlatform()
    }
    val shadowJar by getting(ShadowJar::class) {
        transform(Log4j2PluginsCacheFileTransformer::class.java)
    }
}
