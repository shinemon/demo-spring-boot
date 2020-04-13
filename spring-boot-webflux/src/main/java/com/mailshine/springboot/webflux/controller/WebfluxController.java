package com.mailshine.springboot.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class WebfluxController {

    @GetMapping("/stream/notification")
    public Flux<String> streamString(){
    //todo
        return null;
    }
}
