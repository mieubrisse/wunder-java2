package com.strangegrotto.wunderjava2;

public interface WunderClient {
    public static final String CLIENT_ID_HEADER = "X-Client-ID";
    public static final String ACCESS_TOKEN_HEADER = "X-Access-Token";
    
    /**
     * Gets an access token based on the access code generated when a user grants Wunderlist access to the client
     * @param tempCode
     * @return
     * @see <a href=https://developer.wunderlist.com/documentation/concepts/authorization>Wunderlist authorization documentation</a>
     */
    public String getAccessToken(String accessCode);
    
    /**
     * Gets a user context from the access token generated by the {@link #getAccessToken} method
     * @param accessToken
     * @return
     */
    public WunderUserContext getUserContext(String accessToken);
}
