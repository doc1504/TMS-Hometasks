package com.example.movie5service.client;
import com.example.movie5service.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "movie-client", url = "http://127.0.0.1:8081", path = "/movies")
public interface MovieClient {
    @PostMapping
    MovieDto save (@RequestBody MovieDto dto);
    @PutMapping("/{id}")
    MovieDto update (@PathVariable(name = "id") Integer id,
                     @RequestBody MovieDto dto);
    @GetMapping
    List<MovieDto> getAll ();
}
