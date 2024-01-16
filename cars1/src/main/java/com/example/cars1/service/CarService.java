package com.example.cars1.service;
import com.example.cars1.dto.CarDto;
import java.util.List;
public interface CarService {

    CarDto save (CarDto dto);
    List<CarDto> getAll ();
    CarDto getById (Integer id);
}
