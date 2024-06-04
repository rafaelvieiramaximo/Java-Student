package com.fatec.student.resourses;

import java.util.List;

import com.fatec.student.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.student.dto.StudentResponse;
import com.fatec.student.entities.Student;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @DeleteMapping ("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        
        this.studentService.deleteStudentById(id);

        return ResponseEntity.noContent().build();
        
    }

    @PostMapping
    public Student save (@RequestBody Student student){
        return this.studentService.saveStudent(student);
    }

    @PutMapping("{id}")
    public void update (@PathVariable int id, @RequestBody Student student){
        this.studentService.update(id, student);

    }

}
