package com.example.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String img;
    private double prices;
    private String description;

    public Product() {
    }

    public Product(int id, String img, double prices, String description) {
        this.id = id;
        this.img = img;
        this.prices = prices;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
