package org.hziflytek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class MonitorServer {

    public static void main(String[] args) {
        SpringApplication.run(MonitorServer.class, args);
    }

}
