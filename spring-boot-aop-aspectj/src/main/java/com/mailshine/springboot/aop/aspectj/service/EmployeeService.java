package com.mailshine.springboot.aop.aspectj.service;

import com.mailshine.springboot.aop.aspectj.advise.TrackExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    @TrackExecutionTime
    public String getEmployeeNameFromId(String id){
        return "Test Name From Service";
    }
}
