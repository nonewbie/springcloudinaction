/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-19 21:49
 * File Name      : LoginFeignClient.java
 * Description    : 登录feign
 */

package org.hziflytek.feignclient;

import org.hziflytek.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", configuration = FeignConfig.class)
public interface LoginFeignClient {
    @GetMapping(value = "/userinfo/{userId}")
    String getUserInfo(@PathVariable(value = "userId") String userId);
}
