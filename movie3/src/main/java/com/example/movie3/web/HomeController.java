package com.example.movie3.web;
import com.example.movie3.domain.Genre;
import com.example.movie3.domain.MovieEntity;
import com.example.movie3.dto.MovieCreateDto;
import com.example.movie3.dto.MovieSearchDto;
import com.example.movie3.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public ModelAndView homePage (@ModelAttribute(name = "movie") MovieEntity entity,
                                  @ModelAttribute (name = "searchDto") MovieSearchDto searchDto) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("genres", Genre.values());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView save (@ModelAttribute(name = "movie") MovieCreateDto createDto){
        ModelAndView modelAndView = new ModelAndView("home");
        service.save(createDto);
        modelAndView.addObject("genres", Genre.values());
        modelAndView.addObject("searchDto", new MovieSearchDto());
        return modelAndView;
    }
    @PostMapping("/search")
    public ModelAndView search (MovieSearchDto searchDto) {
        List<MovieEntity> foundMovies = service.findByCriteria(searchDto);
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("movie", new MovieEntity());
        modelAndView.addObject("searchDto", new MovieSearchDto());
        modelAndView.addObject("foundMovies", foundMovies);
        return modelAndView;
    }
}
