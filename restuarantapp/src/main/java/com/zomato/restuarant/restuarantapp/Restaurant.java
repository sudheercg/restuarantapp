package com.zomato.restuarant.restuarantapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Restaurants")
public class Restaurant {
	
	
	@Id
    private int restaurantID;
    private String restaurantName;
    private int countryCode;
    private String city;
    private String address;
    private String locality;
    private String localityVerbose;
    private double longitude;
    private double latitude;
    private String cuisines;
    private int averageCostForTwo;
    private String currency;
    private String hasTableBooking;
    private String hasOnlineDelivery;
    private String isDeliveringNow;
    private String switchToOrderMenu;
    private int priceRange;
    private float aggregateRating;
    private String ratingColor;
    private String ratingText;
    private int votes;


    public int getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getLocalityVerbose() {
		return localityVerbose;
	}
	public void setLocalityVerbose(String localityVerbose) {
		this.localityVerbose = localityVerbose;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public int getAverageCostForTwo() {
		return averageCostForTwo;
	}
	public void setAverageCostForTwo(int averageCostForTwo) {
		this.averageCostForTwo = averageCostForTwo;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getHasTableBooking() {
		return hasTableBooking;
	}
	public void setHasTableBooking(String hasTableBooking) {
		this.hasTableBooking = hasTableBooking;
	}
	public String getHasOnlineDelivery() {
		return hasOnlineDelivery;
	}
	public void setHasOnlineDelivery(String hasOnlineDelivery) {
		this.hasOnlineDelivery = hasOnlineDelivery;
	}
	public String getIsDeliveringNow() {
		return isDeliveringNow;
	}
	public void setIsDeliveringNow(String isDeliveringNow) {
		this.isDeliveringNow = isDeliveringNow;
	}
	public String getSwitchToOrderMenu() {
		return switchToOrderMenu;
	}
	public void setSwitchToOrderMenu(String switchToOrderMenu) {
		this.switchToOrderMenu = switchToOrderMenu;
	}
	public int getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	public float getAggregateRating() {
		return aggregateRating;
	}
	public void setAggregateRating(float aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	public String getRatingColor() {
		return ratingColor;
	}
	public void setRatingColor(String ratingColor) {
		this.ratingColor = ratingColor;
	}
	public String getRatingText() {
		return ratingText;
	}
	public void setRatingText(String ratingText) {
		this.ratingText = ratingText;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
    // Getters and setters
}
