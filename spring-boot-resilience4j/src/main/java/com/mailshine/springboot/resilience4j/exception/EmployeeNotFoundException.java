package com.mailshine.springboot.resilience4j.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
