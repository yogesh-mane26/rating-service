package com.imdb.rating.ratingservice.service;

import com.imdb.rating.ratingservice.model.Rating;

import java.util.List;

public interface RatingService {

    List<Rating> getAll();

    void add(Rating rating);

    List<Rating> getByMovieId(Long movieId);
}
