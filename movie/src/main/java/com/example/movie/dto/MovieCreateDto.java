package com.example.movie.dto;
import com.example.movie.domain.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieCreateDto {
    public String name;
    public Genre genre;
    private String date;
    private Integer rating;
}
