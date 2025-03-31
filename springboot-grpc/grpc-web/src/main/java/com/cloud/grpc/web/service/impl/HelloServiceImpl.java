package com.cloud.grpc.web.service.impl;

import com.cloud.grpc.rpc.service.GreeterGrpc;
import com.cloud.grpc.rpc.service.HelloReply;
import com.cloud.grpc.rpc.service.HelloRequest;
import com.cloud.grpc.web.service.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Slf4j
@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {
    private final GreeterGrpc.GreeterBlockingStub serviceBlockingStub;

    @Override
    public int sayHello(HelloRequest request) {
        HelloReply reply = serviceBlockingStub.sayHello(request);
        if (Objects.nonNull(reply)) {
            log.info("Got RPC reply successfully!");
            return 0;
        } else {
            log.info("Failed to get RPC reply successfully!");
            return -1;
        }
    }
}
