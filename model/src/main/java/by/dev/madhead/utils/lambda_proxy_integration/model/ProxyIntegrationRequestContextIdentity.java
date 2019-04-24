package by.dev.madhead.utils.lambda_proxy_integration.model;

import java.util.Objects;
import java.util.StringJoiner;

public class ProxyIntegrationRequestContextIdentity {
    private String accountId;
    private String apiKey;
    private String apiKeyId;
    private String caller;
    private String cognitoAuthenticationProvider;
    private String cognitoAuthenticationType;
    private String cognitoIdentityId;
    private String cognitoIdentityPoolId;
    private String sourceIp;
    private String user;
    private String userAgent;
    private String userArn;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKeyId() {
        return apiKeyId;
    }

    public void setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCognitoAuthenticationProvider() {
        return cognitoAuthenticationProvider;
    }

    public void setCognitoAuthenticationProvider(String cognitoAuthenticationProvider) {
        this.cognitoAuthenticationProvider = cognitoAuthenticationProvider;
    }

    public String getCognitoAuthenticationType() {
        return cognitoAuthenticationType;
    }

    public void setCognitoAuthenticationType(String cognitoAuthenticationType) {
        this.cognitoAuthenticationType = cognitoAuthenticationType;
    }

    public String getCognitoIdentityId() {
        return cognitoIdentityId;
    }

    public void setCognitoIdentityId(String cognitoIdentityId) {
        this.cognitoIdentityId = cognitoIdentityId;
    }

    public String getCognitoIdentityPoolId() {
        return cognitoIdentityPoolId;
    }

    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserArn() {
        return userArn;
    }

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyIntegrationRequestContextIdentity that = (ProxyIntegrationRequestContextIdentity) o;
        return Objects.equals(accountId, that.accountId) &&
               Objects.equals(apiKey, that.apiKey) &&
               Objects.equals(apiKeyId, that.apiKeyId) &&
               Objects.equals(caller, that.caller) &&
               Objects.equals(cognitoAuthenticationProvider, that.cognitoAuthenticationProvider) &&
               Objects.equals(cognitoAuthenticationType, that.cognitoAuthenticationType) &&
               Objects.equals(cognitoIdentityId, that.cognitoIdentityId) &&
               Objects.equals(cognitoIdentityPoolId, that.cognitoIdentityPoolId) &&
               Objects.equals(sourceIp, that.sourceIp) &&
               Objects.equals(user, that.user) &&
               Objects.equals(userAgent, that.userAgent) &&
               Objects.equals(userArn, that.userArn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            apiKey,
            apiKeyId,
            caller,
            cognitoAuthenticationProvider,
            cognitoAuthenticationType,
            cognitoIdentityId,
            cognitoIdentityPoolId,
            sourceIp,
            user,
            userAgent,
            userArn
        );
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProxyIntegrationRequestContextIdentity.class.getSimpleName() + "[", "]")
            .add("accountId='" + accountId + "'")
            .add("apiKey='" + apiKey + "'")
            .add("apiKeyId='" + apiKeyId + "'")
            .add("caller='" + caller + "'")
            .add("cognitoAuthenticationProvider='" + cognitoAuthenticationProvider + "'")
            .add("cognitoAuthenticationType='" + cognitoAuthenticationType + "'")
            .add("cognitoIdentityId='" + cognitoIdentityId + "'")
            .add("cognitoIdentityPoolId='" + cognitoIdentityPoolId + "'")
            .add("sourceIp='" + sourceIp + "'")
            .add("user='" + user + "'")
            .add("userAgent='" + userAgent + "'")
            .add("userArn='" + userArn + "'")
            .toString();
    }
}
