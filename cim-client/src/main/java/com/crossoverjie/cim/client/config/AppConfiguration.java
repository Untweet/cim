package com.crossoverjie.cim.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2018/8/24 01:43
 * @since JDK 1.8
 */
@Component
public class AppConfiguration {

    @Value("${cim.user.id}")
    private Long userId;

    @Value("${cim.user.userName}")
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
