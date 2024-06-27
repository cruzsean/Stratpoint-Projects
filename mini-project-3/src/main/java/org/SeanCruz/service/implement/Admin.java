package org.SeanCruz.service.implement;

import org.SeanCruz.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    String username;
    String password;
    static List<Product> products;

    public Admin(String username, String password) {
        this.username = "lol";
        this.password = "xd";
        products = new ArrayList<>();
    }

    public static void addProducts(Product product){
        products.add(product);
    }

    public static void removeProducts(){

    }

    public static void updateProducts(){

    }

    public static void listProducts(){

    }

}
