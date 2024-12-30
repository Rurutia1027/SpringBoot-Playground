package com.cloud.fullstack.student;

import com.cloud.fullstack.exception.BadRequestException;
import com.cloud.fullstack.exception.StudentNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Boolean isEmailAlreadyTaken = studentRepository.selectExistEmail(student.getEmail());
        if (isEmailAlreadyTaken) {
            throw new BadRequestException("Email " + student.getEmail() + " taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(String studentId) {
        if (!studentRepository.existsById(Long.parseLong(studentId))) {
            throw new StudentNotFoundException("Student " + studentId + " not found");
        }
        studentRepository.deleteById(Long.parseLong(studentId));
    }
}
