package com.example.movie5.mapper;
import com.example.movie5.domain.MovieEntity;
import com.example.movie5.dto.MovieDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
@Mapper (componentModel = "spring")
public interface MovieMapper {
    MovieDto toDto (MovieEntity entity);
    MovieEntity toEntity (MovieDto dto);
    List<MovieDto> toDtos (List<MovieEntity> entities);
    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget MovieEntity entity, MovieDto dto);
}
