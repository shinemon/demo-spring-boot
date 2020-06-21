package com.mailshine.springboot.mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class StudentDTO implements Serializable {
    private static final long serialVersionUID = -652610286635305248L;

    private UUID id;
    private String studentId;
    private String studentFullName;
    private String course;
}
