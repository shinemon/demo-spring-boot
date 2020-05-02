package com.mailshine.springboot.mutation.controller;

import com.mailshine.springboot.mutation.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class Employee {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/get/employee/name/{id}")
    public String getEmployeeName(@PathVariable String id){
        if (StringUtils.isBlank(id)){
            return null;
        }
        return employeeService.getEmployeeNameFromId(id);
    }
}
