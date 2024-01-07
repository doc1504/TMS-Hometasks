package com.example.movie2.web;
import com.example.movie2.domain.Genre;
import com.example.movie2.domain.MovieEntity;
import com.example.movie2.dto.MovieCreateDto;
import com.example.movie2.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping
public class HomeController {
    private final MovieService service;
    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("genres", Genre.values());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView save (MovieCreateDto dto) {
        ModelAndView modelAndView = new ModelAndView("home");
        service.save(dto);
        modelAndView.addObject("genres", Genre.values());
        List<MovieEntity> all = service.findAll();
        modelAndView.addObject("movies", all);
        return modelAndView;
    }
    @PostMapping("/update/{id}")
    public ModelAndView update(@PathVariable(name = "id") Integer id,
                               @RequestParam(name = "rating", required = false) Integer rating) {

        ModelAndView modelAndView = new ModelAndView("home");
        service.updateMovieByRating(id, rating);
        modelAndView.addObject("genres", Genre.values());
        List<MovieEntity> all = service.findAll();
        modelAndView.addObject("movies", all);
        return modelAndView;
    }
}
