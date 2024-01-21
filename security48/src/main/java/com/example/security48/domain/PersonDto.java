package com.example.security48.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    private String username;
    private String password;
    private String email;
    private Integer age;
}
