package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank(message = "Name is mandatory")
    @Size(min = 0, max = 20, message = "Name Size Range is 0-20")
    private String name;
    @Range(min = 1, max = 99, message = "Age Range is 1 to 99")
    private int age;
}
