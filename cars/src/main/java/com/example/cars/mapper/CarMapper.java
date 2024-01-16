package com.example.cars.mapper;
import com.example.cars.dto.CarDto;
import com.example.cars.model.CarEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (
        componentModel = "spring"
)
public interface CarMapper {
    CarEntity toEntity (CarDto dto);
    CarDto toDto (CarEntity entity);
    List<CarDto> toDtos(List<CarEntity> entities);

}
