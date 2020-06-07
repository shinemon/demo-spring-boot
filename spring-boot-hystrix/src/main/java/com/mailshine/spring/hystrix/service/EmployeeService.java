package com.mailshine.spring.hystrix.service;

import com.mailshine.spring.hystrix.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public String getEmployees(String emplId) throws EmployeeNotFoundException {
        //

        return "Test Emp1";
    }
}
