package com.imdb.rating.ratingservice.repository;

import com.imdb.rating.ratingservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,Long> {

    public List<Rating> findBymID(Long movieId);
}
