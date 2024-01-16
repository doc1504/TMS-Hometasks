package com.example.carstore.service;
import com.example.carstore.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto save (CarDto dto);

    List<CarDto> getAll();
    CarDto getById(Integer id);
}
