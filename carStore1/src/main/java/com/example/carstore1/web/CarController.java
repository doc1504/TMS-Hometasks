package com.example.carstore1.web;
import com.example.carstore1.dto.CarDto;
import com.example.carstore1.dto.InternalCarException;
import com.example.carstore1.service.CarService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
@OpenAPIDefinition(info = @Info(
        title = "This is Car controller",
        description = "The controller allows to save ahd find cars",
        version = "0.0.1",
        summary = "just summary"
))
public class CarController {
    private final CarService service;
    @PostMapping
    @Operation(
            tags = "CRUD",
            description = "This method allows to create car",
            summary = "create car",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "The car created successfully",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(
                                            implementation = CarDto.class)))})
    public CarDto save (@RequestBody CarDto dto){
        return service.save(dto);
    }
    @GetMapping
    @Operation (
            tags = "CRUD",
            description = "This method allows to find all cars",
            summary = "get all cars",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "found all cars successfully",
                            content = @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema (
                                    schema = @Schema(
                                            implementation = CarDto.class))))})
    public List<CarDto> getAll() {
       return service.getAll();
    }
    @GetMapping("/find/{id}")
    @Operation(
            tags = "CRUD",
            description = "This method allows to find car by id",
            summary = " get certain car by id",
            responses = {
                    @ApiResponse (
                            responseCode = "200",
                            description = "the car found successfully",
                            content = @Content (
                                    mediaType = "application/json",
                                    schema = @Schema (
                                            implementation = CarDto.class))),
                    @ApiResponse (
                            responseCode = "400",
                            description = "the car with this id is not found",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(
                                            implementation = InternalCarException.class)))})
    public CarDto getById(@PathVariable(name = "id") Integer id) {
        return service.getById(id);
    }
}
