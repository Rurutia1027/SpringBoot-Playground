package com.cloud.fullstack.controller;

import com.cloud.fullstack.student.Gender;
import com.cloud.fullstack.student.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class StudentController {

    @RequestMapping("/students")
    public List<Student> students() {
        List<Student> ret = Arrays.asList(
                new Student(1L, "Sebby", "sebby@gmail.com", Gender.MALE),
                new Student(1L, "Alex", "alex@gmail.com", Gender.MALE),
                new Student(1L, "Hale", "hale@gmail.com", Gender.FEMALE)
        );
        return ret;
    }
}
