/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-19 21:39
 * File Name      : FeignConfig.java
 * Description    : Feign配置
 */

package org.hziflytek.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer() {
        // 重试间隔100ms，最大重试时间为1s，重试次数为5次
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
