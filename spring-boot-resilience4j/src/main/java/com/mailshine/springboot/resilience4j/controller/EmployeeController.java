package com.mailshine.springboot.resilience4j.controller;

import com.mailshine.springboot.resilience4j.exception.EmployeeNotFoundException;
import com.mailshine.springboot.resilience4j.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/api/sample/hystrix")
public class EmployeeController {

    @Autowired
    @Qualifier(value = "resilienceRestTemplate")
    private RestTemplate resilienceRestTemplate;

    @Autowired
    EmployeeService employeeService;

    /**
     * @param id
     * @return employee name
     */
    @GetMapping("/employee/name/{id}")
    public String getEmployeeName(@PathVariable String id) {
        ResponseEntity<String> responseEntity = null;
        try {
            log.info("Processing getEmployeeName for Name: {}.", id);
            responseEntity = resilienceRestTemplate.getForEntity("http://localhost:8080/api/sample/hystrix/employee/by/id/" + id, String.class);
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
