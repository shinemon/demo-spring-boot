package com.mailshine.spring.hystrix.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/sample/hystrix")
public class EmployeeController {

    @Autowired
    @Qualifier(value = "hystrixRestTemplate")
    private RestTemplate hystrixRestTemplate;

    @GetMapping("/employees/name")
    public List<String> getEmployeesName() {
        return Collections.singletonList("Test");
    }
}
