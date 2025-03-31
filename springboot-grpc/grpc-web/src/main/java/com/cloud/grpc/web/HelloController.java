package com.cloud.grpc.web;

import com.cloud.grpc.rpc.service.HelloRequest;
import com.cloud.grpc.web.dto.HelloRequestDTO;
import com.cloud.grpc.web.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String testHello() {
        HelloRequest request =
                HelloRequest.newBuilder().setName(UUID.randomUUID().toString()).build();

        int ret = helloService.sayHello(request);
        return "Hello";
    }

    @PostMapping
    public int sayHello(@RequestBody HelloRequestDTO requestDTO) {
        HelloRequest request =
                HelloRequest.newBuilder().setName(requestDTO.getName()).build();

        return helloService.sayHello(request);
    }
}
