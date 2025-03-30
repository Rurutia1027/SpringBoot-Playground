package com.cloud.grpc.service;

import com.cloud.grpc.rpc.service.HelloRequest;

public interface HelloService {
    int sayHello(HelloRequest request);
}
