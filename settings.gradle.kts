import org.gradle.api.internal.FeaturePreviews

enableFeaturePreview(FeaturePreviews.Feature.GRADLE_METADATA.name)

rootProject.name = "lambda-proxy-integration-java"

include(":model")
include(":lambda-test")
