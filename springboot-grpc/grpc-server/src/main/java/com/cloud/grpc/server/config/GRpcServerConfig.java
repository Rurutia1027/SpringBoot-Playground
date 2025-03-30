package com.cloud.grpc.server.config;

import com.cloud.grpc.common.interceptor.GrpcServerInterceptor;
import com.cloud.grpc.server.service.GreetServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class GRpcServerConfig {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final GreetServiceImpl greetServiceImpl = new GreetServiceImpl();


    @Bean
    public CommandLineRunner commandLineRunner(final Server server) {
        return args -> executor.submit(() -> {
            try {
                server.awaitTermination();  // Keep gRPC server alive
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
}
