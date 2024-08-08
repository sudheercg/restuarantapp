package com.zomato.restuarant.restuarantapp;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantAPIController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Integer id) {
        return restaurantService.getRestaurantById(id);
    }

    @GetMapping
    public PagedModel<EntityModel<Restaurant>> getAllRestaurants(@RequestParam(defaultValue = "0") int page,
                                                                  @RequestParam(defaultValue = "10") int size,
                                                                  PagedResourcesAssembler<Restaurant> pagedAssembler) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Restaurant> restaurants = restaurantService.getAllRestaurants(pageable);
        return pagedAssembler.toModel(restaurants, 
             WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(RestaurantAPIController.class).getAllRestaurants(page, size, pagedAssembler)).withSelfRel());
    }
}

