/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantInfo;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Saurabh
 */
@ManagedBean
@ApplicationScoped
public class post {
    int id;
    String name;
    String menu;
    String price;
    String phone;
    String address;
    String postal_code;
    String country_code;
    double latitude;
    double longitude;
    String mobile_url;
    String rating;
    String rating_image_url;
    String snippet_text;

    public post() {
    }

    public post(int id, String name, String menu, String price, String phone, String address, String postal_code, String country_code, double latitude, double longitude, String mobile_url, String rating, String rating_image_url, String snippet_text) {
        this.id = id;
        this.name = name;
        this.menu = menu;
        this.price = price;
        this.phone = phone;
        this.address = address;
        this.postal_code = postal_code;
        this.country_code = country_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mobile_url = mobile_url;
        this.rating = rating;
        this.rating_image_url = rating_image_url;
        this.snippet_text = snippet_text;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating_image_url() {
        return rating_image_url;
    }

    public void setRating_image_url(String rating_image_url) {
        this.rating_image_url = rating_image_url;
    }

    public String getSnippet_text() {
        return snippet_text;
    }

    public void setSnippet_text(String snippet_text) {
        this.snippet_text = snippet_text;
    }
    
    
}
