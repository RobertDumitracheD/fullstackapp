package com.fullstack.fullstack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = List.of(
          new Student(1L, "Robert", "dd.roberrt@yahoo.com", Gender.MALE)

        );
        return students;
    }

}
