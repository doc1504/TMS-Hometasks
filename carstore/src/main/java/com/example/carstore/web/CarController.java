package com.example.carstore.web;
import com.example.carstore.dto.CarDto;
import com.example.carstore.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
public class CarController {
    private final CarService service;
    @PostMapping
    public CarDto save (@RequestBody CarDto dto) {
        return service.save(dto);
    }
    @GetMapping
    public List<CarDto> getAll() {
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public CarDto getById (@PathVariable(name = "id") Integer id) {
        return service.getById(id);
    }

}
