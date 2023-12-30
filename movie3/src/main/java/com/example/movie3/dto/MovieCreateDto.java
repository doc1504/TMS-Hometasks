package com.example.movie3.dto;
import com.example.movie3.domain.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieCreateDto {
    private String name;
    private Genre genre;
    private String date;
    private Integer rating;
}
