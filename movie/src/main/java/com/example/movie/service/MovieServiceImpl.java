package com.example.movie.service;
import com.example.movie.domain.MovieEntity;
import com.example.movie.dto.MovieCreateDto;
import com.example.movie.mapper.MovieMapper;
import com.example.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@RequiredArgsConstructor
@Service
@Transactional
public class MovieServiceImpl implements MovieService {
    private final MovieMapper mapper;
    private final MovieRepository repository;

    @Override
    public void save(MovieCreateDto dto) {
        MovieEntity entity = mapper.toEntity(dto);
        repository.save(entity);
    }
    @Override
    public List<MovieEntity> findAll() {
        return repository.findAll();
    }
}
