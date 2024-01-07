package com.example.movie3.dto;
import com.example.movie3.domain.Genre;
import lombok.Data;
@Data
public class MovieSearchDto {
    private String name;
    private Genre genre;
    private Integer ratingFrom;
    private Integer ratingTo;
}
