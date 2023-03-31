package com.RestBasic.springbasicrestapi.controller;

import com.RestBasic.springbasicrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity<Student>  getStudent(){
        Student student = new Student(
                1,
                "Phong",
                "Nguyen"
        );
//        return new ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok().header("custome-header","Phong")
                .body(student);
    }


    @GetMapping("/students")
    public List<Student> getListStudent(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"Theo","Silva"));
        students.add(new Student(3,"Jordan","Berberin"));

        return students;
    }

    //Spring boot rest with path variable

    @GetMapping("/students/{id}")
    public Student studentPathVaribale(@PathVariable("id")  int studentId) {
        return new Student(studentId, "Phong 1", "Nguyen");
    }

    //Request Params
//    http://localhost:8080/student/query?id=0&firstName=urigan&lastName=tai
    @GetMapping("/student/query")
    public Student studentRequestParams(@RequestParam int id,
                                        @RequestParam String firstName,
                                        @RequestParam String lastName

                                        ){
        return new Student(id, firstName, lastName);
    }

    //Post req with params
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

}
