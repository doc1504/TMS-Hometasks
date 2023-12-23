package com.example.movie.service;
import com.example.movie.domain.MovieEntity;
import com.example.movie.dto.MovieCreateDto;
import java.util.List;

public interface MovieService  {
    void save (MovieCreateDto dto);
    List<MovieEntity> findAll();
}
