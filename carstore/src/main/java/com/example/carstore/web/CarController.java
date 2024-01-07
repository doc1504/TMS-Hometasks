package com.example.carstore.web;
import com.example.carstore.dto.CarDto;
import com.example.carstore.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
public class CarController {
    private final CarService service;
    @PostMapping
    public CarDto save (@RequestBody CarDto dto) {
        return service.save(dto);
    }

}
