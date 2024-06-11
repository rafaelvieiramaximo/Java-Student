package com.fatec.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StudentRequest(

@NotNull(message = "Não pode ser nada besta!!")
String name, 

@NotBlank(message = "Não pode ser nada besta!!")
String course, 

@NotNull(message = "Tem que ter!!")
String email

){  
}
