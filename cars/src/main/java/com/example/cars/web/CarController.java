package com.example.cars.web;
import com.example.cars.dto.CarDto;
import com.example.cars.service.CarService;
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
    @GetMapping("/{id}")
    public CarDto find (@PathVariable(name = "id") Integer id) {
        return service.getById(id);
    }


}
