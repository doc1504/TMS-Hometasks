package com.example.carstore1.service;
import com.example.carstore1.dto.CarDto;
import java.util.List;
public interface CarService {
    CarDto save (CarDto dto);
    List<CarDto> getAll();
    CarDto getById (Integer id);
}
