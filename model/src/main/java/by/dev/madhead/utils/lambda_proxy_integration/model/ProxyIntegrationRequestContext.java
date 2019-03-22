package by.dev.madhead.utils.lambda_proxy_integration.model;

import java.util.Objects;
import java.util.StringJoiner;

public class ProxyIntegrationRequestContext {
    private String apiId;
    private String awsEndpointRequestId;
    private String domainName;
    private String domainPrefix;
    private String extendedRequestId;
    private String httpMethod;
    private ProxyIntegrationRequestContextIdentity identity;
    private String path;
    private String protocol;
    private String requestId;
    private String requestTime;
    private String requestTimeEpoch;
    private String resourceId;
    private String resourcePath;
    private String responseLength;
    private String responseLatency;
    private String status;
    private String stage;
    private String wafResponseCode;
    private String webaclArn;
    private String xrayTraceId;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getAwsEndpointRequestId() {
        return awsEndpointRequestId;
    }

    public void setAwsEndpointRequestId(String awsEndpointRequestId) {
        this.awsEndpointRequestId = awsEndpointRequestId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getDomainPrefix() {
        return domainPrefix;
    }

    public void setDomainPrefix(String domainPrefix) {
        this.domainPrefix = domainPrefix;
    }

    public String getExtendedRequestId() {
        return extendedRequestId;
    }

    public void setExtendedRequestId(String extendedRequestId) {
        this.extendedRequestId = extendedRequestId;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public ProxyIntegrationRequestContextIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(ProxyIntegrationRequestContextIdentity identity) {
        this.identity = identity;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestTimeEpoch() {
        return requestTimeEpoch;
    }

    public void setRequestTimeEpoch(String requestTimeEpoch) {
        this.requestTimeEpoch = requestTimeEpoch;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getResponseLength() {
        return responseLength;
    }

    public void setResponseLength(String responseLength) {
        this.responseLength = responseLength;
    }

    public String getResponseLatency() {
        return responseLatency;
    }

    public void setResponseLatency(String responseLatency) {
        this.responseLatency = responseLatency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getWafResponseCode() {
        return wafResponseCode;
    }

    public void setWafResponseCode(String wafResponseCode) {
        this.wafResponseCode = wafResponseCode;
    }

    public String getWebaclArn() {
        return webaclArn;
    }

    public void setWebaclArn(String webaclArn) {
        this.webaclArn = webaclArn;
    }

    public String getXrayTraceId() {
        return xrayTraceId;
    }

    public void setXrayTraceId(String xrayTraceId) {
        this.xrayTraceId = xrayTraceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyIntegrationRequestContext that = (ProxyIntegrationRequestContext) o;
        return Objects.equals(apiId, that.apiId) &&
               Objects.equals(awsEndpointRequestId, that.awsEndpointRequestId) &&
               Objects.equals(domainName, that.domainName) &&
               Objects.equals(domainPrefix, that.domainPrefix) &&
               Objects.equals(extendedRequestId, that.extendedRequestId) &&
               Objects.equals(httpMethod, that.httpMethod) &&
               Objects.equals(identity, that.identity) &&
               Objects.equals(path, that.path) &&
               Objects.equals(protocol, that.protocol) &&
               Objects.equals(requestId, that.requestId) &&
               Objects.equals(requestTime, that.requestTime) &&
               Objects.equals(requestTimeEpoch, that.requestTimeEpoch) &&
               Objects.equals(resourceId, that.resourceId) &&
               Objects.equals(resourcePath, that.resourcePath) &&
               Objects.equals(responseLength, that.responseLength) &&
               Objects.equals(responseLatency, that.responseLatency) &&
               Objects.equals(status, that.status) &&
               Objects.equals(stage, that.stage) &&
               Objects.equals(wafResponseCode, that.wafResponseCode) &&
               Objects.equals(webaclArn, that.webaclArn) &&
               Objects.equals(xrayTraceId, that.xrayTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            apiId,
            awsEndpointRequestId,
            domainName,
            domainPrefix,
            extendedRequestId,
            httpMethod,
            identity,
            path,
            protocol,
            requestId,
            requestTime,
            requestTimeEpoch,
            resourceId,
            resourcePath,
            responseLength,
            responseLatency, status, stage, wafResponseCode, webaclArn, xrayTraceId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProxyIntegrationRequestContext.class.getSimpleName() + "[", "]")
            .add("apiId='" + apiId + "'")
            .add("awsEndpointRequestId='" + awsEndpointRequestId + "'")
            .add("domainName='" + domainName + "'")
            .add("domainPrefix='" + domainPrefix + "'")
            .add("extendedRequestId='" + extendedRequestId + "'")
            .add("httpMethod='" + httpMethod + "'")
            .add("identity=" + identity)
            .add("path='" + path + "'")
            .add("protocol='" + protocol + "'")
            .add("requestId='" + requestId + "'")
            .add("requestTime='" + requestTime + "'")
            .add("requestTimeEpoch='" + requestTimeEpoch + "'")
            .add("resourceId='" + resourceId + "'")
            .add("resourcePath='" + resourcePath + "'")
            .add("responseLength='" + responseLength + "'")
            .add("responseLatency='" + responseLatency + "'")
            .add("status='" + status + "'")
            .add("stage='" + stage + "'")
            .add("wafResponseCode='" + wafResponseCode + "'")
            .add("webaclArn='" + webaclArn + "'")
            .add("xrayTraceId='" + xrayTraceId + "'")
            .toString();
    }
}
