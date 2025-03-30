package com.cloud.grpc.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GRpcClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(GRpcClientApplication.class, args);
    }
}
