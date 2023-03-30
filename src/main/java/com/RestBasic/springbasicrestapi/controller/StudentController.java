package com.RestBasic.springbasicrestapi.controller;

import com.RestBasic.springbasicrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Phong",
                "Nguyen"
        );
        return student;
    }


}
