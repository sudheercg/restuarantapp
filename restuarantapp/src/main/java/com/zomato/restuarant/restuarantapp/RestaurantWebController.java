package com.zomato.restuarant.restuarantapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/restaurants")
public class RestaurantWebController {

    @Autowired
    private RestaurantWebService restaurantService;

    @GetMapping
    public String getAllRestaurants(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size,
                                    Model model) {
        List<Restaurant> restaurants = restaurantService.getAllRestaurants(page, size);
        model.addAttribute("restaurants", restaurants);
        model.addAttribute("currentPage", page);
        model.addAttribute("size", size);
        return "restuarant-list";
    }

    @GetMapping("/{id}")
    public String getRestaurantById(@PathVariable Integer id, Model model) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        model.addAttribute("restaurant", restaurant);
        return "restuarant-detail";
    }
}
