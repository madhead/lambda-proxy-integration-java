package by.dev.madhead.utils.lambda_proxy_integration.lambdatest

import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationRequest
import by.dev.madhead.utils.lambda_proxy_integration.model.ProxyIntegrationResponse
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class Handler : RequestHandler<ProxyIntegrationRequest, ProxyIntegrationResponse> {
    override fun handleRequest(input: ProxyIntegrationRequest, context: Context): ProxyIntegrationResponse {
        return ProxyIntegrationResponse(
            200,
            emptyMap(),
            "Hello, World!"
        )
    }
}
