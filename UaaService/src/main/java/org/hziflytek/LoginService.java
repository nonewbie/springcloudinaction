/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-19 21:45
 * File Name      : LoginService.java
 * Description    : 登录
 */

package org.hziflytek;

import org.hziflytek.feignclient.LoginFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginFeignClient loginFeignClient;

    public String getUserInfo(String userId) {
        return loginFeignClient.getUserInfo(userId);
    }
}
