package com.cloud.grpc.common.interceptor;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.MethodDescriptor;

public class GrpcClientInterceptor implements ClientInterceptor {

    private final String gRPCClientName;
    private final String gRPCServerName;

    public GrpcClientInterceptor(final String gRPCClientName, final String gRPCServerName) {
        this.gRPCClientName = gRPCClientName;
        this.gRPCServerName = gRPCServerName;
    }


    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor,
                                                               CallOptions callOptions, Channel channel) {
        return null;
    }


}
