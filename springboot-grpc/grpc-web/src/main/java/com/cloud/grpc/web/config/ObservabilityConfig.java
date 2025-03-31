package com.cloud.grpc.web.config;

import io.micrometer.tracing.Tracer;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Hooks;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@Slf4j
public class ObservabilityConfig {
    @EventListener(ApplicationStartedEvent.class)
    public void onStart() {
        Hooks.enableAutomaticContextPropagation();
    }
}
