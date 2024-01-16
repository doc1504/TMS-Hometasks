package com.example.movie5.web;
import com.example.movie5.dto.MovieDto;
import com.example.movie5.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;
    @PostMapping
    public MovieDto save (@RequestBody MovieDto dto){
        return service.save(dto);
    }
    @PutMapping("/{id}")
    public MovieDto update (@PathVariable (name = "id") Integer id,
                            @RequestBody MovieDto dto) {
        return service.update(id, dto);
    }
    @GetMapping
    public List<MovieDto> getAll () {
        return service.getAll();
    }
}
