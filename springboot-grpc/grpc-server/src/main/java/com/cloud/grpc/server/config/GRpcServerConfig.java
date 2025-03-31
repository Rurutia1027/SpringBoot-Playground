//package com.cloud.grpc.server.config;
//
//import com.cloud.grpc.server.service.GreetServiceImpl;
//import io.grpc.Server;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//@Configuration
//public class GRpcServerConfig {
//    private final ExecutorService executor = Executors.newSingleThreadExecutor();
//
//    private final GreetServiceImpl greetServiceImpl;
//
//    @Autowired
//    public GRpcServerConfig(GreetServiceImpl greetServiceImpl) {
//        this.greetServiceImpl = greetServiceImpl;
//    }
//
//}
