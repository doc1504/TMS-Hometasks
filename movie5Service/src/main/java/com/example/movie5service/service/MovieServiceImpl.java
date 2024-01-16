package com.example.movie5service.service;
import com.example.movie5service.client.MovieClient;
import com.example.movie5service.dto.MovieDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {
    private final MovieClient client;
    @Override
    public MovieDto create(MovieDto dto) {
        return client.save(dto);
    }
    @Override
    public MovieDto update(Integer id, MovieDto dto) {
        return client.update(id, dto);
    }
    @Override
    public List<MovieDto> getAll() {
        return client.getAll();
    }
}
