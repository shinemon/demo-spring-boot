package com.mailshine.springboot.mapstruct.dto.sample2;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EmployeeDTO implements Serializable {
    private static final long serialVersionUID = -1982320844677160215L;

    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
}

