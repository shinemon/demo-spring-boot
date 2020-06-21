package com.mailshine.springboot.mapstruct.dao.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Student implements Serializable {

    private UUID id;
    private String studentId;
    private String studentFullName;
    private String course;
}
