package io.javabrain.moviecatalogservice.Models;

public class Rating{
    private String movieId;
    private int rating;
        
    public Rating(String movieId, int rating){
        this.setMovieId(movieId);
        this.setRating(rating);
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the movieId
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * @param movieId the movieId to set
     */
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}