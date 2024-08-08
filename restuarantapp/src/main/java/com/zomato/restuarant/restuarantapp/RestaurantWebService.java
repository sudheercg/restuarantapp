package com.zomato.restuarant.restuarantapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RestaurantWebService {

	/*
	 *private String apiBaseUrl =
	 * "http://localhost:8080/api/restaurants"; // Ensure this is correct
	 */
    
    //http://localhost:8080/api/restaurants
	
	 private final WebClient webClient; 
    @Value("${api.base.url}")
    private String apiBaseUrl;

    public RestaurantWebService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(apiBaseUrl).build();
    }

    public List<Restaurant> getAllRestaurants(int page, int size) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/restaurants").queryParam("page", page).queryParam("size", size).build())
                .retrieve()
                .bodyToFlux(Restaurant.class)
                .collectList()
                .block();
    }

    public Restaurant getRestaurantById(Integer id) {
        return this.webClient.get()
                .uri("/api/restaurants/{id}", id)
                .retrieve()
                .bodyToMono(Restaurant.class)
                .block();
    }
}
