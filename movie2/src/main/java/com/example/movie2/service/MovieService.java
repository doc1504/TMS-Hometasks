package com.example.movie2.service;
import com.example.movie2.domain.MovieEntity;
import com.example.movie2.dto.MovieCreateDto;
import java.util.List;
public interface MovieService {
    void save (MovieCreateDto dto);
    List<MovieEntity> findAll();
    void updateMovieByRating(Integer id, Integer rating);
}
