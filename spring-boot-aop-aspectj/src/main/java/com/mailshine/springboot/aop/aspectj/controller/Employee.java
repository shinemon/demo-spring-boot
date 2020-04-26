package com.mailshine.springboot.aop.aspectj.controller;

import com.mailshine.springboot.aop.aspectj.advise.TrackExecutionTime;
import com.mailshine.springboot.aop.aspectj.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api")
public class Employee {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/get/employee/name/{id}")
    @TrackExecutionTime
    public String getEmployeeName(@PathVariable String id){
        if (StringUtils.isBlank(id)){
            return null;
        }
        return employeeService.getEmployeeNameFromId(id);
    }
}
