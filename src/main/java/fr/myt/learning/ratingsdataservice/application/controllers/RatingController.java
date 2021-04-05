package fr.myt.learning.ratingsdataservice.application.controllers;

import fr.myt.learning.ratingsdataservice.domain.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieiD) {
        return new Rating(movieiD, 3);
    }

    @GetMapping("/users/{userId}")
    public List<Rating> getMoviesRating(@PathVariable("userId") String userId) {
        return List.of(
                        new Rating("1234", 3),
                        new Rating("1235", 9)
                );
    }
}
