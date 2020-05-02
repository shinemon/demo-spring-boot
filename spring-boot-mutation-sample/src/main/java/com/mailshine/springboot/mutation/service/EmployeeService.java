package com.mailshine.springboot.mutation.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    public String getEmployeeNameFromId(String id){
        return "Name of Employee: " + id;
    }
}
