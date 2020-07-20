/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-20 23:14
 * File Name      : LoginHystrix.java
 * Description    :
 */

package org.hziflytek.hystrix;

import org.hziflytek.feignclient.LoginFeignClient;
import org.springframework.stereotype.Component;

@Component
public class LoginHystrix implements LoginFeignClient {
    @Override
    public String getUserInfo(String userId) {
        return "sorry, error! " + userId;
    }
}
