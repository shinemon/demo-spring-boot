package com.mailshine.swagger.yaml.controllers;

import com.mailshine.swagger.yaml.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDemoController {

  @Autowired
  private Course demoCourse;

  @GetMapping("/getCourse")
  public Course getCourse() {
    return demoCourse;
  }

}
