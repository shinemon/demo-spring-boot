package com.mailshine.springboot.mapstruct.service;

import com.mailshine.springboot.mapstruct.dao.entity.sample1.Student;
import com.mailshine.springboot.mapstruct.dto.sample1.StudentDTO;
import com.mailshine.springboot.mapstruct.mappers.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private final StudentMapper studentMapper;

  public StudentService(StudentMapper studentMapper) {
    this.studentMapper = studentMapper;
  }

  public StudentDTO save(StudentDTO studentDTO) {

    Student studentEntity = studentMapper.studentDtoToStudent(studentDTO);
    ///  actual save actions.
    return studentDTO;
  }
}
