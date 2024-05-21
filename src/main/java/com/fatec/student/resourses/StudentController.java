package com.fatec.student.resourses;

import java.util.List;

import com.fatec.student.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.student.entities.Student;


@RestController
@RequestMapping("students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    

}
