package com.example.shoppingcart.entity;

import java.util.HashMap;
import java.util.Map;


public class Cart {
    private Map<Product,Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
    public void deleteProduct(Product product) {
        Map.Entry<Product, Integer> productInCart = selectItemInCart(product);
        if (productInCart != null) {
            products.remove(productInCart.getKey());
        }
    }

    private boolean checkItemInCart(Product product){
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if(entry.getKey().getId()==product.getId()){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectItemInCart(Product product){
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if(entry.getKey().getId()==product.getId()){
                return entry;
            }
        }
        return null;
    }
    public void addProduct(Product product){
        if (!checkItemInCart(product)){
            products.put(product,1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity = itemEntry.getValue() + 1;
            products.replace(itemEntry.getKey(),newQuantity);
        }
    }
    public Float countTotalPayment(){
        float payment = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrices() * (float) entry.getValue();
        }
        return payment;
    }
    public void changeQuantity(Product product, int newQuantity) {
        if (!checkItemInCart(product)) {
            products.put(product, newQuantity);
        } else {
            Map.Entry<Product, Integer> productInCart = selectItemInCart(product);
            if (productInCart != null) {
                if (newQuantity > 0) {
                    products.replace(productInCart.getKey(), newQuantity);
                } else {
                    products.remove(productInCart);
                }
            }
        }
    }
}
