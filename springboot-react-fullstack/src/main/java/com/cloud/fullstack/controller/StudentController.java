package com.cloud.fullstack.controller;

import com.cloud.fullstack.student.Student;
import com.cloud.fullstack.student.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @RequestMapping("/students")
    public List<Student> students() throws InterruptedException {
        // add this for testing fetch status is shown on page
        Thread.sleep(5000);
        List<Student> ret = studentService.getAllStudents();
        return ret;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") String studentId) {
        studentService.deleteStudent(studentId);
    }
}
