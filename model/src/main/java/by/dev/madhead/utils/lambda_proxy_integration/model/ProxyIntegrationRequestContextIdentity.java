package by.dev.madhead.utils.lambda_proxy_integration.model;

import com.google.common.base.MoreObjects;

import java.util.Objects;

public class ProxyIntegrationRequestContextIdentity {
    private String cognitoIdentityPoolId;
    private String accountId;
    private String cognitoIdentityId;
    private String caller;
    private String apiKey;
    private String sourceIp;
    private String cognitoAuthenticationType;
    private String cognitoAuthenticationProvider;
    private String userArn;
    private String userAgent;
    private String user;

    public String getCognitoIdentityPoolId() {
        return cognitoIdentityPoolId;
    }

    public void setCognitoIdentityPoolId(final String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(final String accountId) {
        this.accountId = accountId;
    }

    public String getCognitoIdentityId() {
        return cognitoIdentityId;
    }

    public void setCognitoIdentityId(final String cognitoIdentityId) {
        this.cognitoIdentityId = cognitoIdentityId;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(final String caller) {
        this.caller = caller;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(final String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(final String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getCognitoAuthenticationType() {
        return cognitoAuthenticationType;
    }

    public void setCognitoAuthenticationType(final String cognitoAuthenticationType) {
        this.cognitoAuthenticationType = cognitoAuthenticationType;
    }

    public String getCognitoAuthenticationProvider() {
        return cognitoAuthenticationProvider;
    }

    public void setCognitoAuthenticationProvider(final String cognitoAuthenticationProvider) {
        this.cognitoAuthenticationProvider = cognitoAuthenticationProvider;
    }

    public String getUserArn() {
        return userArn;
    }

    public void setUserArn(final String userArn) {
        this.userArn = userArn;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(final String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyIntegrationRequestContextIdentity that = (ProxyIntegrationRequestContextIdentity) o;
        return Objects.equals(cognitoIdentityPoolId, that.cognitoIdentityPoolId) &&
               Objects.equals(accountId, that.accountId) &&
               Objects.equals(cognitoIdentityId, that.cognitoIdentityId) &&
               Objects.equals(caller, that.caller) &&
               Objects.equals(apiKey, that.apiKey) &&
               Objects.equals(sourceIp, that.sourceIp) &&
               Objects.equals(cognitoAuthenticationType, that.cognitoAuthenticationType) &&
               Objects.equals(cognitoAuthenticationProvider, that.cognitoAuthenticationProvider) &&
               Objects.equals(userArn, that.userArn) &&
               Objects.equals(userAgent, that.userAgent) &&
               Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            cognitoIdentityPoolId,
            accountId,
            cognitoIdentityId,
            caller,
            apiKey,
            sourceIp,
            cognitoAuthenticationType,
            cognitoAuthenticationProvider,
            userArn,
            userAgent,
            user
        );
    }

    @Override
    public String toString() {
        return MoreObjects
            .toStringHelper(this)
            .add("cognitoIdentityPoolId", cognitoIdentityPoolId)
            .add("accountId", accountId)
            .add("cognitoIdentityId", cognitoIdentityId)
            .add("caller", caller)
            .add("apiKey", apiKey)
            .add("sourceIp", sourceIp)
            .add("cognitoAuthenticationType", cognitoAuthenticationType)
            .add("cognitoAuthenticationProvider", cognitoAuthenticationProvider)
            .add("userArn", userArn)
            .add("userAgent", userAgent)
            .add("user", user)
            .toString();
    }
}
