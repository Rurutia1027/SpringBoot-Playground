package com.cloud.grpc.client.service;

import com.cloud.grpc.rpc.service.GreeterGrpc;
import com.cloud.grpc.rpc.service.HelloRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class GreetService {
    private final GreeterGrpc.GreeterBlockingStub serviceBlockingStub;

    public int sayHello(HelloRequest request) {
        if (Objects.nonNull(serviceBlockingStub)) {
            serviceBlockingStub.sayHello(request);
            return 0;
        }
        return -1;
    }
}
