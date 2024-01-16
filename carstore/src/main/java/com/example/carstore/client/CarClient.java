package com.example.carstore.client;

import com.example.carstore.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "car-client", url = "http://127.0.0.1:8081", path = "/cars")
public interface CarClient {
    @PostMapping
    CarDto save (@RequestBody CarDto dto);
    @GetMapping
    List<CarDto> getAll();
    @GetMapping("/{id}")
    public CarDto find (@PathVariable(name = "id") Integer id);

}
