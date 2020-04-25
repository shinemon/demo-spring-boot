package com.mailshine.springboot.aop.aspectj.controller;

import com.mailshine.springboot.aop.aspectj.advise.TrackExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class Employee {

    @GetMapping(value = "/get/employee/name")
    @TrackExecutionTime
    public String getEmployeeName(String id){
        return "Test Name";
    }
}
