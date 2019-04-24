import com.jfrog.bintray.gradle.BintrayExtension
import com.jfrog.bintray.gradle.BintrayPlugin
import io.spring.gradle.dependencymanagement.DependencyManagementPlugin
import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    id("io.spring.dependency-management").version("1.0.6.RELEASE").apply(false)
    id("com.jfrog.bintray").version("1.8.4").apply(false)
}

subprojects {
    apply<DependencyManagementPlugin>()
    apply<MavenPublishPlugin>()
    if (this != project(":lambda-test")) {
        apply<BintrayPlugin>()
    }

    repositories {
        jcenter()
        maven("https://kotlin.bintray.com/kotlinx")
    }

    configure<DependencyManagementExtension> {
        imports {
            mavenBom("org.junit:junit-bom:5.3.1")
        }
    }

    if (this != project(":lambda-test")) {
        configure<BintrayExtension> {
            user = System.getenv("BINTRAY_USER")
            key = System.getenv("BINTRAY_KEY")
        }
    }
}

tasks {
    wrapper {
        gradleVersion = "5.4"
        distributionType = Wrapper.DistributionType.ALL
    }
}
