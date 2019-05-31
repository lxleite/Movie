package io.javabrain.moviecatalogservice.Resources;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.javabrain.moviecatalogservice.Models.*;

@RequestMapping("/catalog")
@RestController
public class MovieCatalogResource{

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        
        //RestTemplate restTemplate = new RestTemplate();

        //Get all rated movie IDs
        //Movie movie = restTemplate.getForObject("http://localhost:8083/movies/2", Movie.class);

        List<Rating> ratings = Arrays.asList(
            new Rating( "1234", 4),
            new Rating( "5678", 5)
        );

        //For each movieId, call movie info Service and get details
        /*return ratings.stream().map(rating -> new CatalogItem("Tranformers", "Test", 4))
            .collect(Collectors.toList());*/
        return ratings.stream().map( rating -> {
            Movie movie = restTemplate.getForObject( "http://localhost:8083/movies/" + rating.getMovieId(), Movie.class);
            return new CatalogItem( movie.getName(), "Test", rating.getRating() );
        })
        .collect(Collectors.toList() );

        //Put them all together
        /*return Collections.singletonList(
            //new CatalogItem("Tranformers", "Test", 4)
        );*/

        
    }
}