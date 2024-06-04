package com.fatec.student.mappers;

import com.fatec.student.dto.StudentResponse;
import com.fatec.student.entities.Student;

public class StudentMapper {
    

    public static StudentResponse toDTO(Student student){

        return new StudentResponse(student.getId(),student.getName(), student.getCourse(), student.getEmail());
    }
}
