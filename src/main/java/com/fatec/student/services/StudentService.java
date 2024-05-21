package com.fatec.student.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.student.entities.Student;
import com.fatec.student.repositories.StudentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){

        return studentRepository.findAll();
    }

    public Student getStudentById(int id){

       return studentRepository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("Aluno não cadastrado")

       );

    }

    public void deleteStudentById(int id){

        if(this.studentRepository.existsById(id)){
            this.studentRepository.deleteById(id);
        }else{
            throw new EntityNotFoundException("Aluno não encontrado");
        }
    }

    public Student saveStudent(Student student){
        return this.studentRepository.save(student);
    }

    public void update(int id, Student student){
        try {
            Student aux = studentRepository.getReferenceById(id);
            aux.setCourse(student.getCourse());
            aux.setName(student.getName());
            aux.setEmail(student.getEmail());
            this.studentRepository.save(aux);

        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException ("Aluno inexistente no BD");
        }
    }
}
