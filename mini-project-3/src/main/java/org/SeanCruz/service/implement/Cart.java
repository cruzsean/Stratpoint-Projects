package org.SeanCruz.service.implement;

import org.SeanCruz.model.Product;
import org.SeanCruz.service.CartServices;

import java.util.ArrayList;
import java.util.List;

public class Cart implements CartServices {
    static List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }
    public static void displayProducts(){
        for (Product p: products){
            System.out.println(products);
        }
    }

    public static void displayCart(){

    }

    public static void addCart(Product product){
        products.add(product);
    }

    public void removeCart(){

    }
    public void returnHome(){

    }
    public void calculateTotal(){

    }
}

