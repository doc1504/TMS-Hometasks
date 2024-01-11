package com.example.carstore.service;
import com.example.carstore.client.CarClient;
import com.example.carstore.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
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
        return client.find(id);
    }
}
