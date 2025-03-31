package com.cloud.grpc.web.config;

import com.cloud.grpc.common.interceptor.GrpcClientInterceptor;
import com.cloud.grpc.rpc.service.GreeterGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class GRpcClientGreetConfig {
    @Value("${grpc-client.greet.host}")
    private String grpcHost;

    @Value("${grpc-client.greet.port}")
    private int grpcPort;

    private static final String GRPC_CLIENT_NAME = "greet-client";
    private static final String GRPC_SERVER_NAME = "greet-server";

    @Bean(name = "managedChannelGreet")
    public ManagedChannel managedChannelGreet() {
        return ManagedChannelBuilder.forAddress(grpcHost, grpcPort)
                .usePlaintext()
                .idleTimeout(20, TimeUnit.MINUTES)
               // .intercept(new GrpcClientInterceptor(GRPC_CLIENT_NAME, GRPC_SERVER_NAME))
                .build();
    }


    @Bean
    public GreeterGrpc.GreeterBlockingStub greeterBlockingStub(final ManagedChannel managedChannel) {
        return GreeterGrpc.newBlockingStub(managedChannel);
    }
}