package com.example.cars.web;
import com.example.cars.dto.CarDto;
import com.example.cars.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService service;
    @PostMapping
    public CarDto save (@RequestBody CarDto dto) {
        return service.save(dto);
    }
}
