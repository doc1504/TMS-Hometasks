package com.example.movie5service.web;
import com.example.movie5service.dto.MovieDto;
import com.example.movie5service.service.MovieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/service/movies")
public class MovieController {
    private final MovieService service;
    @PostMapping
    public MovieDto create (@Valid @RequestBody MovieDto dto) {
        return service.create(dto);
    }
    @PutMapping("/{id}")
    public MovieDto update(@PathVariable(name = "id") Integer id,
                          @Valid @RequestBody MovieDto dto) {
      return   service.update(id, dto);
    }
    @GetMapping
    public List<MovieDto> getAll() {
        return service.getAll();
    }
}
