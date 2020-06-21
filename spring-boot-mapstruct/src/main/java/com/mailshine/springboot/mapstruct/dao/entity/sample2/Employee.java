package com.mailshine.springboot.mapstruct.dao.entity.sample2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Employee implements Serializable {
    private static final long serialVersionUID = -915074092244502794L;

    @Id
    private String empId;
    private String firstNm;
    private String lastNm;
    private String department;
}
