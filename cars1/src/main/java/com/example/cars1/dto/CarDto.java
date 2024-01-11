package com.example.cars1.dto;
import com.example.cars1.model.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private Integer id;
    private Model model;
    private String color;
    private Integer age;
    private Integer cost;
}
