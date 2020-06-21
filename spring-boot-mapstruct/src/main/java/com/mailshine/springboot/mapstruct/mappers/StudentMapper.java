package com.mailshine.springboot.mapstruct.mappers;

import com.mailshine.springboot.mapstruct.dao.entity.sample1.Student;
import com.mailshine.springboot.mapstruct.dto.sample1.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO studentToStudentDTO(Student student);

    Student studentDtoToStudent(StudentDTO studentDTO);
}
