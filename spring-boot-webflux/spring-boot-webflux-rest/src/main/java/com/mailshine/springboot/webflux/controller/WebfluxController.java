package com.mailshine.springboot.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

import static com.mailshine.springboot.webflux.NotificationSample.stringList;

@RestController
@RequestMapping("/api")
public class WebfluxController {

    @GetMapping("/stream/notification")
    public Flux<String> streamString(){
        return Flux.fromStream(stringList().stream())
                .map(s -> String.valueOf(s))
                .delayElements(Duration.ofSeconds(1));
    }



}
