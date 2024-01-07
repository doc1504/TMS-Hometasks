package com.example.movie3.service;
import com.example.movie3.domain.Genre;
import com.example.movie3.domain.MovieEntity;
import com.example.movie3.dto.MovieCreateDto;
import com.example.movie3.dto.MovieSearchDto;
import com.example.movie3.mapper.MovieMapper;
import com.example.movie3.repository.MovieRepository;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
@Transactional
public class MovieServiceImpl implements MovieService {
    private final MovieRepository repository;
    private final MovieMapper mapper;
    @Override
    public void save(MovieCreateDto createDto) {
        MovieEntity entity = mapper.toEntity(createDto);
        repository.save(entity);
    }
    @Override
    public List<MovieEntity> findByCriteria(MovieSearchDto searchDto) {
        Specification<MovieEntity> spec = createSpec(searchDto);
        List<MovieEntity> all = repository.findAll(spec);
        return all;
    }
    private Specification<MovieEntity> createSpec (MovieSearchDto searchDto) {
        return (root, query, criteriaBuilder) -> {
            String name = searchDto.getName();
            Genre genre = searchDto.getGenre();
            Integer ratingFrom = searchDto.getRatingFrom();
            Integer ratingTo = searchDto.getRatingTo();

            var predicate = new ArrayList<Predicate>();
            if (name != null && !name.isBlank()) {
                Predicate nameLike = criteriaBuilder.like(root.get("name"),"%" + name + "%");
                predicate.add(nameLike);
            }
            if (genre != null) {
                Predicate genreEq = criteriaBuilder.equal(root.get("genre"), genre);
                predicate.add(genreEq);
            }
            if (ratingFrom != null) {
                Predicate ratingGe = criteriaBuilder.ge(root.get("rating"), ratingFrom);
                predicate.add(ratingGe);
            }
            if (ratingTo != null) {
                Predicate ratingLe = criteriaBuilder.le(root.get("rating"), ratingTo);
                predicate.add(ratingLe);
            }
            Predicate[] array = predicate.toArray(Predicate[]::new);
            return criteriaBuilder.and(array);
        };
    }
}
