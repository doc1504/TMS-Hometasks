package com.example.movie2.mapper;
import com.example.movie2.domain.MovieEntity;
import com.example.movie2.dto.MovieCreateDto;
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
    MovieEntity toEntity(MovieCreateDto dto);
}
