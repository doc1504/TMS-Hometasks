package com.example.carstore1.service;
import com.example.carstore1.client.CarClient;
import com.example.carstore1.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarClient client;
    @Override
    public CarDto save(CarDto dto) {
        return client.save(dto);
    }
    @Override
    public List<CarDto> getAll() {
        return client.getAll();
    }
    @Override
    public CarDto getById(Integer id) {
        return client.getById(id);
    }
}
