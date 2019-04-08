package by.dev.madhead.utils.lambda_proxy_integration.lambdatest

import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationRequest
import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationRequestContext
import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationRequestContextIdentity
import com.fasterxml.jackson.databind.DeserializationFeature
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.http.ContentType
import io.ktor.http.content.TextContent
import kotlinx.coroutines.runBlocking
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class Test {
    lateinit var client: HttpClient

    @BeforeTest
    fun setup() {
        client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = JacksonSerializer {
                    this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                }
            }
        }
    }

    @Test
    fun get() = runBlocking {
        val response = client.get<Response>(
            "https://1hm3fn8j06.execute-api.us-east-1.amazonaws.com/default"
        )

        assertEquals(
            ProxyIntegrationRequest().apply {
                resource = "/"
                path = "/"
                httpMethod = "GET"
                headers = mapOf(
                    "Accept" to "application/json",
                    "Host" to "1hm3fn8j06.execute-api.us-east-1.amazonaws.com",
                    "User-Agent" to "CIO/ktor"
                )
                multiValueHeaders = mapOf(
                    "Accept" to listOf("application/json"),
                    "Host" to listOf("1hm3fn8j06.execute-api.us-east-1.amazonaws.com"),
                    "User-Agent" to listOf("CIO/ktor")
                )
                requestContext = ProxyIntegrationRequestContext().apply {
                    apiId = "1hm3fn8j06"
                    domainName = "1hm3fn8j06.execute-api.us-east-1.amazonaws.com"
                    domainPrefix = "1hm3fn8j06"
                    httpMethod = "GET"
                    identity = ProxyIntegrationRequestContextIdentity().apply {
                        userAgent = "CIO/ktor"
                    }
                    path = "/default"
                    protocol = "HTTP/1.1"
                    resourceId = "ycizbmosdl"
                    resourcePath = "/"
                    stage = "default"
                }
            },
            response.input.apply {
                headers = headers.filterKeys { it in listOf("Accept", "Host", "User-Agent") }
                multiValueHeaders = multiValueHeaders.filterKeys { it in listOf("Accept", "Host", "User-Agent") }
                requestContext.extendedRequestId = null
                requestContext.identity.sourceIp = null
                requestContext.requestId = null
                requestContext.requestTime = null
                requestContext.requestTimeEpoch = null
            }
        )
    }

    @Test
    fun getWithParams() = runBlocking {
        val response = client.get<Response>(
            "https://1hm3fn8j06.execute-api.us-east-1.amazonaws.com/default?key1=value1&key2=value2"
        )

        assertEquals(
            ProxyIntegrationRequest().apply {
                resource = "/"
                path = "/"
                httpMethod = "GET"
                headers = mapOf(
                    "Accept" to "application/json",
                    "Host" to "1hm3fn8j06.execute-api.us-east-1.amazonaws.com",
                    "User-Agent" to "CIO/ktor"
                )
                multiValueHeaders = mapOf(
                    "Accept" to listOf("application/json"),
                    "Host" to listOf("1hm3fn8j06.execute-api.us-east-1.amazonaws.com"),
                    "User-Agent" to listOf("CIO/ktor")
                )
                queryStringParameters = mapOf(
                    "key1" to "value1",
                    "key2" to "value2"
                )
                multiValueQueryStringParameters = mapOf(
                    "key1" to listOf("value1"),
                    "key2" to listOf("value2")
                )
                requestContext = ProxyIntegrationRequestContext().apply {
                    apiId = "1hm3fn8j06"
                    domainName = "1hm3fn8j06.execute-api.us-east-1.amazonaws.com"
                    domainPrefix = "1hm3fn8j06"
                    httpMethod = "GET"
                    identity = ProxyIntegrationRequestContextIdentity().apply {
                        userAgent = "CIO/ktor"
                    }
                    path = "/default"
                    protocol = "HTTP/1.1"
                    resourceId = "ycizbmosdl"
                    resourcePath = "/"
                    stage = "default"
                }
            },
            response.input.apply {
                headers = headers.filterKeys { it in listOf("Accept", "Host", "User-Agent") }
                multiValueHeaders = multiValueHeaders.filterKeys { it in listOf("Accept", "Host", "User-Agent") }
                requestContext.extendedRequestId = null
                requestContext.identity.sourceIp = null
                requestContext.requestId = null
                requestContext.requestTime = null
                requestContext.requestTimeEpoch = null
            }
        )
    }

    @Test
    fun getWithMultiParams() = runBlocking {
        val response = client.get<Response>(
            "https://1hm3fn8j06.execute-api.us-east-1.amazonaws.com/default?key1=value1&key2=first+value&key2=second+value"
        )

        assertEquals(
            ProxyIntegrationRequest().apply {
                resource = "/"
                path = "/"
                httpMethod = "GET"
                headers = mapOf(
                    "Accept" to "application/json",
                    "Host" to "1hm3fn8j06.execute-api.us-east-1.amazonaws.com",
                    "User-Agent" to "CIO/ktor"
                )
                multiValueHeaders = mapOf(
                    "Accept" to listOf("application/json"),
                    "Host" to listOf("1hm3fn8j06.execute-api.us-east-1.amazonaws.com"),
                    "User-Agent" to listOf("CIO/ktor")
                )
                queryStringParameters = mapOf(
                    "key1" to "value1",
                    "key2" to "second value"
                )
                multiValueQueryStringParameters = mapOf(
                    "key1" to listOf("value1"),
                    "key2" to listOf("first value", "second value")
                )
                requestContext = ProxyIntegrationRequestContext().apply {
                    apiId = "1hm3fn8j06"
                    domainName = "1hm3fn8j06.execute-api.us-east-1.amazonaws.com"
                    domainPrefix = "1hm3fn8j06"
                    httpMethod = "GET"
                    identity = ProxyIntegrationRequestContextIdentity().apply {
                        userAgent = "CIO/ktor"
                    }
                    path = "/default"
                    protocol = "HTTP/1.1"
                    resourceId = "ycizbmosdl"
                    resourcePath = "/"
                    stage = "default"
                }
            },
            response.input.apply {
                headers = headers.filterKeys { it in listOf("Accept", "Host", "User-Agent") }
                multiValueHeaders = multiValueHeaders.filterKeys { it in listOf("Accept", "Host", "User-Agent") }
                requestContext.extendedRequestId = null
                requestContext.identity.sourceIp = null
                requestContext.requestId = null
                requestContext.requestTime = null
                requestContext.requestTimeEpoch = null
            }
        )
    }

    @Test
    fun post() = runBlocking {
        val response = client.post<Response>(
            "https://1hm3fn8j06.execute-api.us-east-1.amazonaws.com/default?key1=value1&key2=first+value&key2=second+value"
        ) {
            header("X-Seconds-To-Mars", "30")
            header("X-Skywalkers", "Luke")
            header("X-Skywalkers", "Leia")
            body = TextContent("""{"hello":"world!"}""", ContentType.Application.Json)
        }

        assertEquals(
            ProxyIntegrationRequest().apply {
                resource = "/"
                path = "/"
                httpMethod = "POST"
                headers = mapOf(
                    "Accept" to "application/json",
                    "Host" to "1hm3fn8j06.execute-api.us-east-1.amazonaws.com",
                    "User-Agent" to "CIO/ktor",
                    "X-Seconds-To-Mars" to "30"
                )
                multiValueHeaders = mapOf(
                    "Accept" to listOf("application/json"),
                    "Host" to listOf("1hm3fn8j06.execute-api.us-east-1.amazonaws.com"),
                    "User-Agent" to listOf("CIO/ktor"),
                    "X-Seconds-To-Mars" to listOf("30")
                )
                queryStringParameters = mapOf(
                    "key1" to "value1",
                    "key2" to "second value"
                )
                multiValueQueryStringParameters = mapOf(
                    "key1" to listOf("value1"),
                    "key2" to listOf("first value", "second value")
                )
                requestContext = ProxyIntegrationRequestContext().apply {
                    apiId = "1hm3fn8j06"
                    domainName = "1hm3fn8j06.execute-api.us-east-1.amazonaws.com"
                    domainPrefix = "1hm3fn8j06"
                    httpMethod = "POST"
                    identity = ProxyIntegrationRequestContextIdentity().apply {
                        userAgent = "CIO/ktor"
                    }
                    path = "/default"
                    protocol = "HTTP/1.1"
                    resourceId = "ycizbmosdl"
                    resourcePath = "/"
                    stage = "default"
                }
            },
            response.input.apply {
                headers = headers.filterKeys { it in listOf("Accept", "Host", "User-Agent", "X-Seconds-To-Mars", "X-Skywalkers") }
                multiValueHeaders = multiValueHeaders.filterKeys { it in listOf("Accept", "Host", "User-Agent", "X-Seconds-To-Mars", "X-Skywalkers") }
                requestContext.extendedRequestId = null
                requestContext.identity.sourceIp = null
                requestContext.requestId = null
                requestContext.requestTime = null
                requestContext.requestTimeEpoch = null
            }
        )
    }
}
