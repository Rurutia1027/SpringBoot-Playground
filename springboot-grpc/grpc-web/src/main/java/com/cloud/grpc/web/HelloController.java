package com.cloud.grpc.web;

import com.cloud.grpc.rpc.service.HelloRequest;
import com.cloud.grpc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String testHello() {
        return "Hello";
    }

    @PostMapping
    public int sayHello(@RequestBody HelloRequest request) {
        return helloService.sayHello(request);
    }

}
