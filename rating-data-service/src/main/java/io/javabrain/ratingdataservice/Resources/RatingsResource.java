package io.javabrain.ratingdataservice.Resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrain.ratingdataservice.Models.Rating;

@RestController
@RequestMapping("/ratingdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating( movieId, 4);
    }
}