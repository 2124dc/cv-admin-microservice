package com.app.cv.admin_micro_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CV_AdminMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CV_AdminMicroServiceApplication.class, args);
        System.out.println("CV_AdminMicroServiceApplication Successfully started...!!!");
    }

}
