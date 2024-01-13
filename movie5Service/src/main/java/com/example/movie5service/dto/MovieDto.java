package com.example.movie5service.dto;
import com.example.movie5service.validation.CheckNameValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private Integer id;
    @CheckNameValidation
    private String name;
    private Integer rating;
}
