package fr.myt.learning.ratingsdataservice.application.models;

import fr.myt.learning.ratingsdataservice.domain.models.Rating;

import java.util.List;

public class ResultRating {

    private List<Rating> ratings;

    public ResultRating() {

    }

    public ResultRating(final List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
