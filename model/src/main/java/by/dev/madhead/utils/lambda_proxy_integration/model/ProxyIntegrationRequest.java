package by.dev.madhead.utils.lambda_proxy_integration.model;

import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

public class ProxyIntegrationRequest {
    private String resource;
    private String path;
    private String httpMethod;
    private Map<String, String> headers;
    private Map<String, String> queryStringParameters;
    private Map<String, String> pathParameters;
    private Map<String, String> stageVariables;
    private ProxyIntegrationRequestContext requestContext;
    private String body;
    private Boolean isBase64Encoded;

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(final String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(final Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getQueryStringParameters() {
        return queryStringParameters;
    }

    public void setQueryStringParameters(final Map<String, String> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    public Map<String, String> getPathParameters() {
        return pathParameters;
    }

    public void setPathParameters(final Map<String, String> pathParameters) {
        this.pathParameters = pathParameters;
    }

    public Map<String, String> getStageVariables() {
        return stageVariables;
    }

    public void setStageVariables(final Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    public ProxyIntegrationRequestContext getRequestContext() {
        return requestContext;
    }

    public void setRequestContext(final ProxyIntegrationRequestContext requestContext) {
        this.requestContext = requestContext;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public Boolean getBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(final Boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyIntegrationRequest that = (ProxyIntegrationRequest) o;
        return Objects.equals(resource, that.resource) &&
               Objects.equals(path, that.path) &&
               Objects.equals(httpMethod, that.httpMethod) &&
               Objects.equals(headers, that.headers) &&
               Objects.equals(queryStringParameters, that.queryStringParameters) &&
               Objects.equals(pathParameters, that.pathParameters) &&
               Objects.equals(stageVariables, that.stageVariables) &&
               Objects.equals(requestContext, that.requestContext) &&
               Objects.equals(body, that.body) &&
               Objects.equals(isBase64Encoded, that.isBase64Encoded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resource,
            path,
            httpMethod,
            headers,
            queryStringParameters,
            pathParameters,
            stageVariables,
            requestContext,
            body,
            isBase64Encoded
        );
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProxyIntegrationRequest.class.getSimpleName() + "[", "]")
            .add("resource='" + resource + "'")
            .add("path='" + path + "'")
            .add("httpMethod='" + httpMethod + "'")
            .add("headers=" + headers)
            .add("queryStringParameters=" + queryStringParameters)
            .add("pathParameters=" + pathParameters)
            .add("stageVariables=" + stageVariables)
            .add("requestContext=" + requestContext)
            .add("body='" + body + "'")
            .add("isBase64Encoded=" + isBase64Encoded)
            .toString();
    }
}
