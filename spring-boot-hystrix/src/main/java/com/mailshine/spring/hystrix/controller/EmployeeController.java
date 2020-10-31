package com.mailshine.spring.hystrix.controller;

import com.mailshine.spring.hystrix.exception.EmployeeNotFoundException;
import com.mailshine.spring.hystrix.service.EmployeeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    EmployeeService employeeService;

    /**
     * @param id
     * @return employee name
     * To induce Failure/OpenCircuit and Hystrix FallBack plz reduce timeoutInMilliseconds to lower value.
     */
    @GetMapping("/employee/name/{id}")
    @HystrixCommand(fallbackMethod = "getDataFallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    public String getEmployeeName(@PathVariable String id) {
        ResponseEntity<String> responseEntity = null;
        try {
            log.info("Processing getEmployeeName for Name: {}.", id);
            responseEntity = hystrixRestTemplate.getForEntity("http://localhost:8080/api/sample/hystrix/employee/by/id/" + id, String.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            throw new EmployeeNotFoundException("Test");
        }
    }


    @GetMapping("/employee/by/id/{id}")
    public ResponseEntity<String> getEmployeesNameById(@PathVariable String id) throws EmployeeNotFoundException {
        log.info("Processing getEmployeesNameById for ID: {}.", id);
        return ResponseEntity.ok(employeeService.getEmployees(id));
    }

    public String getDataFallBack(String id) {
        return "Default Emp";
    }
}
