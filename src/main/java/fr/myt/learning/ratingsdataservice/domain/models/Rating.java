package fr.myt.learning.ratingsdataservice.domain.models;

import lombok.Data;

@Data
public class Rating {
    private final String movieId;
    private final int count;

    public Rating(String movieId, int count) {
        this.movieId = movieId;
        this.count = count;
    }
}
