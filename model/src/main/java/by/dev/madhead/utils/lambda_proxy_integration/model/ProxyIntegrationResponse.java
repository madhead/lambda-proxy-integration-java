package by.dev.madhead.utils.lambda_proxy_integration.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

public class ProxyIntegrationResponse {
    private Boolean isBase64Encoded;
    private Integer statusCode;
    private Map<String, String> headers;
    private Map<String, List<String>> multiValueHeaders;
    private String body;

    public ProxyIntegrationResponse() {
    }

    public ProxyIntegrationResponse(
        final Boolean isBase64Encoded,
        final Integer statusCode,
        final Map<String, String> headers,
        final Map<String, List<String>> multiValueHeaders,
        final String body
    ) {
        this.isBase64Encoded = isBase64Encoded;
        this.statusCode = statusCode;
        this.headers = headers;
        this.multiValueHeaders = multiValueHeaders;
        this.body = body;
    }

    public ProxyIntegrationResponse(
        final Integer statusCode,
        final Map<String, String> headers,
        final Map<String, List<String>> multiValueHeaders,
        final String body
    ) {
        this(false, statusCode, headers, multiValueHeaders, body);
    }

    public ProxyIntegrationResponse(
        final Integer statusCode,
        final Map<String, String> headers,
        final String body
    ) {
        this(false, statusCode, headers, null, body);
    }

    public ProxyIntegrationResponse(
        final Integer statusCode,
        final Map<String, String> headers,
        final Map<String, List<String>> multiValueHeaders
    ) {
        this(false, statusCode, headers, multiValueHeaders, null);
    }

    public ProxyIntegrationResponse(
        final Integer statusCode,
        final Map<String, String> headers
    ) {
        this(false, statusCode, headers, null, null);
    }

    public Boolean getBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(final Boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(final Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, List<String>> getMultiValueHeaders() {
        return multiValueHeaders;
    }

    public void setMultiValueHeaders(Map<String, List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyIntegrationResponse that = (ProxyIntegrationResponse) o;
        return Objects.equals(isBase64Encoded, that.isBase64Encoded) &&
               Objects.equals(statusCode, that.statusCode) &&
               Objects.equals(headers, that.headers) &&
               Objects.equals(multiValueHeaders, that.multiValueHeaders) &&
               Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBase64Encoded, statusCode, headers, multiValueHeaders, body);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProxyIntegrationResponse.class.getSimpleName() + "[", "]")
            .add("isBase64Encoded=" + isBase64Encoded)
            .add("statusCode=" + statusCode)
            .add("headers=" + headers)
            .add("multiValueHeaders=" + multiValueHeaders)
            .add("body='" + body + "'")
            .toString();
    }
}
