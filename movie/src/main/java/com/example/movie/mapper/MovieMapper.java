package com.example.movie.mapper;

import com.example.movie.domain.MovieEntity;
import com.example.movie.dto.MovieCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper (
        componentModel = "spring"
)
public interface MovieMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "genre", source = "genre")
    @Mapping(target = "date", source = "date")
    @Mapping(target = "rating", source = "rating")
    MovieEntity toEntity (MovieCreateDto dto);
}
