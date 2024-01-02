package com.example.cars.service;
import com.example.cars.dto.CarDto;
import com.example.cars.mapper.CarMapper;
import com.example.cars.model.CarEntity;
import com.example.cars.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@RequiredArgsConstructor
@Service
@Transactional
public class CarServiceImpl implements CarService {
    private final CarRepository repository;
    private final CarMapper mapper;
    @Override
    public CarDto save(CarDto dto) {
        CarEntity entity = mapper.toEntity(dto);
        CarEntity saved = repository.save(entity);
        return mapper.toDto(saved);
    }
}
