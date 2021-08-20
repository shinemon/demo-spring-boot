package com.mailshine.springboot.resilience4j.service;

import com.mailshine.springboot.resilience4j.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String getEmployees(String emplId) throws EmployeeNotFoundException {
        //

        return "Test Emp1";
    }
}
