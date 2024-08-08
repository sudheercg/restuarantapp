package com.zomato.restuarant.restuarantapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Optional<Restaurant> getRestaurantById(Integer id) {
        return restaurantRepository.findById(id);
    }

    public Page<Restaurant> getAllRestaurants(Pageable pageable) {
        return restaurantRepository.findAll(pageable);
    }
    public void saveRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }
}
