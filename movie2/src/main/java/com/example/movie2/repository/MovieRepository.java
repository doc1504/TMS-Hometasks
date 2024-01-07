package com.example.movie2.repository;
import com.example.movie2.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    @Modifying
    void updateMovieByRating(Integer id, Integer rating);
}
