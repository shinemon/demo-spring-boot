package com.mailshine.springboot.mutation.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeService employeeService;

    @Test
    public void EmployeServiceTest1(){
       String result = employeeService.getEmployeeNameFromId("Test");
       Assert.assertNotNull(result);
    }
}
