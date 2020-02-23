package demospringboot.controllers;

import demospringboot.models.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class SimpleController {

    private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @GetMapping (value = "/get/hello/message")
    public String sayHello(){
        return "Hello There!";
    }

    @GetMapping (value = "/get/employee/list")
    public Set<Employee> employeeSet(){
        Set <Employee> employees = new HashSet<>();
        Employee employee = new Employee();
        employee.setEmployeeId("1");
        employee.setEmployeeFirstName("John");
        employee.setEmployeeLastName("Smith");
        employee.setEmployeeFullName("John Smith");
        employees.add(employee);
        logger.info("Employee Details returned is : " + employee.toString());
      return employees;
    }
}
