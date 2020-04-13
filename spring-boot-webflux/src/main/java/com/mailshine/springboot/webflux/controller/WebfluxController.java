package com.mailshine.springboot.webflux.controller;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebfluxController {

    @GetMapping("/stream/notification")
    public Flux<String> streamString(){
        return Flux.fromStream(stringList().stream())
                .map(s -> String.valueOf(s))
                .delayElements(Duration.ofSeconds(5));
    }


    private static List<String> stringList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Demo String One");
        stringList.add("Demo String Two");
        stringList.add("Demo String Three");
        stringList.add("Demo String Four");
        stringList.add("Demo String Five");
        stringList.add("Demo String Six");
        stringList.add("Demo String Seven");
        stringList.add("Demo String Eight");
        stringList.add("Demo String Nine");
        stringList.add("Demo String Ten");
        return stringList;
    }
}
