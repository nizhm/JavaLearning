package com.nizhm.sms.commons;

/**
 * @author nizhm
 */
public class LoginInfo {
    private String sessionId;
    private Long userId;
    private String userName;

    public String getSessionId() {
        return this.sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getUserId() {
        return this.userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
