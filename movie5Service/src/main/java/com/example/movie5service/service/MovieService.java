package com.example.movie5service.service;
import com.example.movie5service.dto.MovieDto;
import java.util.List;
public interface MovieService {
    MovieDto create (MovieDto dto);
    MovieDto update (Integer id, MovieDto dto);
    List<MovieDto> getAll();
}
