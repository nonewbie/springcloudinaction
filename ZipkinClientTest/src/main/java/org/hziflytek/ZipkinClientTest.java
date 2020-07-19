package org.hziflytek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZipkinClientTest {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientTest.class, args);
    }

}
