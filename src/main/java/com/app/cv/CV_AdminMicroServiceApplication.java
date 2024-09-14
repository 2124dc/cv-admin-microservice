package com.app.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoAuditing
public class CV_AdminMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CV_AdminMicroServiceApplication.class, args);
        System.out.println("CV_AdminMicroServiceApplication Successfully started...!!!");
    }

}
