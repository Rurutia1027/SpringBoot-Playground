package com.cloud.grpc.server;

import com.cloud.grpc.server.service.GreetServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class GRpcServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GRpcServerApplication.class, args);
    }


    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${grpc.server.port}")
    private int port;

    private final GreetServiceImpl greetService;

    @Autowired
    public GRpcServerApplication(GreetServiceImpl greetService) {
        this.greetService = greetService;
    }

    @Bean
    public Server grpcServer() throws IOException {
        Server server = ServerBuilder
                .forPort(port)
                .addService(greetService)
                //.intercept(new GrpcServerInterceptor(applicationName))
                .build();

        server.start();
        return server;
    }
}

