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
    public List<Student> students() throws InterruptedException {
        // add this for testing fetch status is shown on page
        Thread.sleep(10000);
        List<Student> ret = Arrays.asList(
                new Student(1L, "Sebby", "sebby@gmail.com", Gender.MALE),
                new Student(2L, "Alex", "alex@gmail.com", Gender.MALE),
                new Student(3L, "Hale", "hale@gmail.com", Gender.FEMALE)
        );
        return ret;
    }
}
