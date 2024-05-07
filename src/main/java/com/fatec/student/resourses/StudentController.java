package com.fatec.student.resourses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.student.entities.Student;


@RestController
@RequestMapping("students")


public class StudentController {
    
    @GetMapping
    public List<Student> getStudent(){

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Rafael");
        s1.setCourse("ADS");
        s1.setEmail("rafael.maximo@gamil.com");

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Gabriel");
        s2.setCourse("GTI");
        s2.setEmail("gabriel.com");

        Student s3 = new Student();
        s3.setId(3);
        s3.setName("Enzola");
        s3.setCourse("Eventos");
        s3.setEmail("forado@gmail.com");
    
        
        ArrayList<Student> lista = new ArrayList<Student>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        
        return lista;


   }
}
