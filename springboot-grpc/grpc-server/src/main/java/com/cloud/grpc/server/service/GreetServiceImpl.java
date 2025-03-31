package com.cloud.grpc.server.service;

import com.cloud.grpc.rpc.service.GreeterGrpc;
import com.cloud.grpc.rpc.service.HelloReply;
import com.cloud.grpc.rpc.service.HelloRequest;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;


@Service
public class GreetServiceImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello, " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
