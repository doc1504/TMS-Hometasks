package com.example.security48.repository;
import com.example.security48.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
    Optional<PersonEntity> findByUsername(String username);
}
