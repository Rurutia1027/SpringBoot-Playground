package com.cloud.grpc.common.interceptor;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

public class GrpcServerInterceptor implements ServerInterceptor {
    private final String applicationName;

    public GrpcServerInterceptor(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        return null;
    }
}
