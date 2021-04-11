package fr.myt.learning.ratingsdataservice.application.controllers;

import fr.myt.learning.ratingsdataservice.application.models.ResultRating;
import fr.myt.learning.ratingsdataservice.domain.models.Rating;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
@Slf4j
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieiD) {
        return new Rating(movieiD, 3);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity getMoviesRating(@PathVariable("userId") String userId, String auth) throws InterruptedException {

        List<Rating> ratings = List.of(
                new Rating("1234", 3),
                new Rating("1235", 9)
        );

        Thread.sleep(9000);
        ResponseEntity responseEntity = new ResponseEntity(new ResultRating(ratings), HttpStatus.OK);
        log.info("Response {}",responseEntity );

        return responseEntity;
    }
}
