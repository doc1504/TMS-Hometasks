package com.example.cars1.web;
import com.example.cars1.dto.CarDto;
import com.example.cars1.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
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
    public CarDto getById(@PathVariable(name = "id") Integer id) {
        return service.getById(id);
    }
}
