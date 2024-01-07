package com.example.carstore.service;
import com.example.carstore.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final RestTemplate template;
    @Override
    public CarDto save(CarDto dto) {
        ResponseEntity<CarDto> responseEntity = template.postForEntity("http://127.0.0.1:8081/cars", dto, CarDto.class);

        return responseEntity.getBody();
    }
}
