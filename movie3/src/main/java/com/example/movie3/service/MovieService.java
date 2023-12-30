package com.example.movie3.service;
import com.example.movie3.domain.MovieEntity;
import com.example.movie3.dto.MovieCreateDto;
import com.example.movie3.dto.MovieSearchDto;
import java.util.List;
public interface MovieService {
    void save(MovieCreateDto createDto);
    List<MovieEntity> findByCriteria(MovieSearchDto searchDto);
}
