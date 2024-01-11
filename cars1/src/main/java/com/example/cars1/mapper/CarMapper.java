package com.example.cars1.mapper;
import com.example.cars1.dto.CarDto;
import com.example.cars1.model.CarEntity;
import org.mapstruct.Mapper;
import java.util.List;
@Mapper (
        componentModel = "spring"
)
public interface CarMapper {
    CarDto toDto (CarEntity entity);
    CarEntity toEntity (CarDto dto);
    List<CarDto> toDtos (List<CarEntity> entities);
}
