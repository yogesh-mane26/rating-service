package com.imdb.rating.ratingservice.service;

import com.imdb.rating.ratingservice.model.Rating;
import com.imdb.rating.ratingservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public List<Rating> getAll() {
        return ratingRepository.findAll();
    }

    @Override
    public void add(Rating rating) {
        ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getByMovieId(Long movieId) {
        return ratingRepository.findBymID(movieId);
    }
}
