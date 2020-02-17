package net.mailshine.demo.demospringboot.controllers;

import net.mailshine.demo.demospringboot.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @GetMapping (value = "/get/hello/message")
    public String sayHello(){
        return "Hello There!";
    }

    @GetMapping (value = "/get/employee/list")
    public Set<Employee> employeeSet(){
      return null;
    }
}
