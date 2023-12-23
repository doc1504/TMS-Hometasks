package com.example.movie.web;
import com.example.movie.domain.Genre;
import com.example.movie.domain.MovieEntity;
import com.example.movie.dto.MovieCreateDto;
import com.example.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
