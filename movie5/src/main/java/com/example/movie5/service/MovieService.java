package com.example.movie5.service;
import com.example.movie5.dto.MovieDto;

import java.util.List;
public interface MovieService {
    MovieDto save (MovieDto dto);
    MovieDto update (Integer id, MovieDto dto);
    List<MovieDto> getAll ();
}
