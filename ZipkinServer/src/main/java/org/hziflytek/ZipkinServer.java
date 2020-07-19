package org.hziflytek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class ZipkinServer {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServer.class, args);
    }

}
