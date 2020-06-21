package com.mailshine.springboot.mapstruct.mappers;

import com.mailshine.springboot.mapstruct.dao.entity.sample2.Employee;
import com.mailshine.springboot.mapstruct.dto.sample2.EmployeeDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "empId", target = "employeeId")
    @Mapping(source = "firstNm", target = "firstName")
    @Mapping(source = "lastNm", target = "lastName")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    @InheritInverseConfiguration
    Employee employeeDtoToEmploye(EmployeeDTO employeeDTO);
}
