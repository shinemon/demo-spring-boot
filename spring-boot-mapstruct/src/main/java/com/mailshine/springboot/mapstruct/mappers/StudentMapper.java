package com.mailshine.springboot.mapstruct.mappers;

import com.mailshine.springboot.mapstruct.dao.entity.Student;
import com.mailshine.springboot.mapstruct.dto.StudentDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    //@InheritInverseConfiguration
    StudentDTO studentToStudentDTO(Student student);

    Student studentDtoToStudent(StudentDTO studentDTO);
}
