package com.SeanCruz.service;

import com.SeanCruz.model.Product;

public interface CartServices {
    public void addCart(Product product);
    public void removeCart(String ID);
    public void displayCart();
    public void calculateTotal();
}
