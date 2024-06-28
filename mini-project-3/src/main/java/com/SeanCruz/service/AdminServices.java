package com.SeanCruz.service;

import com.SeanCruz.model.Product;

public interface AdminServices {
    public void addProducts(Product product);
    public void removeProducts(String ID);
}
