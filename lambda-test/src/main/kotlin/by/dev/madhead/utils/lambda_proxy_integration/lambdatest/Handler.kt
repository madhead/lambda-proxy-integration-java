package by.dev.madhead.utils.lambda_proxy_integration.lambdatest

import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationRequest
import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationResponse
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.logging.log4j.LogManager

private data class Response(
    val input: ProxyIntegrationRequest,
    val context: Context
)

class Handler : RequestHandler<ProxyIntegrationRequest, ProxyIntegrationResponse> {
    companion object {
        @JvmStatic
        private val logger = LogManager.getLogger(Handler::class.java)

        @JvmStatic
        private val objectMapper = ObjectMapper()
    }

    override fun handleRequest(input: ProxyIntegrationRequest, context: Context): ProxyIntegrationResponse {
        logger.debug(objectMapper.writeValueAsString(input))
        logger.debug(objectMapper.writeValueAsString(context))

        val response = Response(input, context)

        logger.debug(objectMapper.writeValueAsString(input))

        return ProxyIntegrationResponse(
            200,
            emptyMap(),
            objectMapper.writeValueAsString(response)
        )
    }
}
