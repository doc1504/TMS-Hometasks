package com.example.movie3.repository;
import com.example.movie3.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface MovieRepository extends JpaRepository<MovieEntity, Integer>, JpaSpecificationExecutor<MovieEntity> {
}
