package by.dev.madhead.utils.lambda_proxy_integration.lambdatest

import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationRequest
import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationResponse
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import org.apache.logging.log4j.LogManager

class Handler : RequestHandler<ProxyIntegrationRequest, ProxyIntegrationResponse> {
    companion object {
        @JvmStatic
        private val logger = LogManager.getLogger(Handler::class.java)

        @JvmStatic
        private val objectMapper = ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
    }

    override fun handleRequest(input: ProxyIntegrationRequest, context: Context): ProxyIntegrationResponse {
        logger.debug(objectMapper.writeValueAsString(input))
        logger.debug(objectMapper.writeValueAsString(context))

        val response = Response(input)

        logger.debug(objectMapper.writeValueAsString(input))

        return ProxyIntegrationResponse(
            200,
            emptyMap(),
            objectMapper.writeValueAsString(response)
        )
    }
}
