package by.dev.madhead.utils.lambda_proxy_integration.model;

import com.google.common.base.MoreObjects;

import java.util.Objects;

public class ProxyIntegrationRequestContext {
    private String accountId;
    private String resourceId;
    private String stage;
    private String requestId;
    private ProxyIntegrationRequestContextIdentity identity;
    private String resourcePath;
    private String httpMethod;
    private String apiId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(final String accountId) {
        this.accountId = accountId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(final String resourceId) {
        this.resourceId = resourceId;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(final String stage) {
        this.stage = stage;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }

    public ProxyIntegrationRequestContextIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(final ProxyIntegrationRequestContextIdentity identity) {
        this.identity = identity;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(final String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(final String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(final String apiId) {
        this.apiId = apiId;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyIntegrationRequestContext that = (ProxyIntegrationRequestContext) o;
        return Objects.equals(accountId, that.accountId) &&
               Objects.equals(resourceId, that.resourceId) &&
               Objects.equals(stage, that.stage) &&
               Objects.equals(requestId, that.requestId) &&
               Objects.equals(identity, that.identity) &&
               Objects.equals(resourcePath, that.resourcePath) &&
               Objects.equals(httpMethod, that.httpMethod) &&
               Objects.equals(apiId, that.apiId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, resourceId, stage, requestId, identity, resourcePath, httpMethod, apiId);
    }

    @Override
    public String toString() {
        return MoreObjects
            .toStringHelper(this)
            .add("accountId", accountId)
            .add("resourceId", resourceId)
            .add("stage", stage)
            .add("requestId", requestId)
            .add("identity", identity)
            .add("resourcePath", resourcePath)
            .add("httpMethod", httpMethod)
            .add("apiId", apiId)
            .toString();
    }
}
