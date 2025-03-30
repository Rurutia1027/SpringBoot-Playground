package com.cloud.grpc.service.impl;

import com.cloud.grpc.client.service.GreetService;
import com.cloud.grpc.rpc.service.HelloRequest;
import com.cloud.grpc.service.HelloService;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {

    private GreetService helloGrpcClient;

    @Override
    public int sayHello(HelloRequest request) {
        return helloGrpcClient.sayHello(request);
    }
}
