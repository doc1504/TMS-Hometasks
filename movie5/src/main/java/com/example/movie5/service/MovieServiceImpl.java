package com.example.movie5.service;
import com.example.movie5.domain.MovieEntity;
import com.example.movie5.dto.MovieDto;
import com.example.movie5.exc.MovieException;
import com.example.movie5.mapper.MovieMapper;
import com.example.movie5.repository.MovieRepository;
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
    public MovieDto save(MovieDto dto) {
        MovieEntity entity = mapper.toEntity(dto);
        MovieEntity save = repository.save(entity);
        return mapper.toDto(save);
    }

    @Override
    public MovieDto update(Integer id, MovieDto dto) {
        var entity = repository.findById(id)
                .orElseThrow(()-> new MovieException("Movie not found"));
        mapper.update(entity, dto);
        return mapper.toDto(entity);
    }

    @Override
    public List<MovieDto> getAll() {
        List<MovieEntity> all = repository.findAll();
        return mapper.toDtos(all);
    }
}
