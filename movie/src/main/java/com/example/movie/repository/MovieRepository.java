package com.example.movie.repository;
import com.example.movie.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <MovieEntity, Integer> {
}
