package com.imdb.rating.ratingservice.controller;

import com.imdb.rating.ratingservice.model.Rating;
import com.imdb.rating.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.imdb.rating.ratingservice.controller.RatingController.BASE_URL;

@RestController
@RequestMapping(BASE_URL)
public class RatingController {

    static final String BASE_URL="api/service/v1/rating";
    public final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/all")
    public List<Rating> getAllRating() {
        return ratingService.getAll();
    }

    @PostMapping("/add")
    public void addRating(@RequestBody Rating rating) {
        ratingService.add(rating);
    }

    @GetMapping("/{movieId}")
    public List<Rating> getMovieList(@PathVariable("movieId") Long movieId ){
        return ratingService.getByMovieId(movieId);
    }



}
