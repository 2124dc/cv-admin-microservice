package com.app.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoAuditing
public class AdminMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminMicroserviceApplication.class, args);
        System.out.println("AdminMicroserviceApplication Successfully started...!!!");
    }

}
