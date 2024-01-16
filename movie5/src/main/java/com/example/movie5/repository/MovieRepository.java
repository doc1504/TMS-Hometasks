package com.example.movie5.repository;
import com.example.movie5.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
}
