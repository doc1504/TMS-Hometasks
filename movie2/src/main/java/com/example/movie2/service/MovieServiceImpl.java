package com.example.movie2.service;
import com.example.movie2.domain.MovieEntity;
import com.example.movie2.dto.MovieCreateDto;
import com.example.movie2.mapper.MovieMapper;
import com.example.movie2.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@RequiredArgsConstructor
@Service
@Transactional
public class MovieServiceImpl implements MovieService {
    private final MovieRepository repository;
    private final MovieMapper mapper;
    @Override
    public void save(MovieCreateDto dto) {
        MovieEntity entity = mapper.toEntity(dto);
        repository.save(entity);
    }
    @Override
    public List<MovieEntity> findAll() {
        return repository.findAll();
    }
    @Override
    public void updateMovieByRating(Integer id, Integer rating) {
        repository.updateMovieByRating(id, rating);
    }
}
