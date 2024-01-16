package com.example.cars1.service;
import com.example.cars1.dto.CarDto;
import com.example.cars1.exc.CarFailedException;
import com.example.cars1.mapper.CarMapper;
import com.example.cars1.model.CarEntity;
import com.example.cars1.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository repository;
    private final CarMapper mapper;
    @Override
    public CarDto save(CarDto dto) {
        CarEntity entity = mapper.toEntity(dto);
        CarEntity save = repository.save(entity);
        return mapper.toDto(save) ;
    }
    @Override
    public List<CarDto> getAll() {
        List<CarEntity> all = repository.findAll();
        return mapper.toDtos(all) ;
    }
    @Override
    public CarDto getById(Integer id) {
        var car = repository.findById(id)
                .orElseThrow(()->new CarFailedException("The car doesn't exist"));
        return mapper.toDto(car);
    }
}
