package com.example.cars.service;
import com.example.cars.dto.CarDto;
import com.example.cars.model.CarEntity;

import java.util.List;

public interface CarService  {
    CarDto save (CarDto dto);

    List<CarDto> getAll();
    CarDto getById(Integer id);

}
