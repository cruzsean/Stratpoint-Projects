package com.SeanCruz.service.implement;

import com.SeanCruz.model.Product;
import com.SeanCruz.service.CartServices;

import java.util.ArrayList;
import java.util.List;

public class Cart implements CartServices {
    static List<Product> products;
    //    static boolean productFound = false;
    public Cart() {
        products = new ArrayList<>();
    }

    public void addCart(Product product){
        products.add(product);
    }

    public void removeCart(String ID){
        if (products.removeIf(product -> product.getId().equals(ID))){
            System.out.println("Product Removed");
        }else
            System.out.println("Product not found");
    }

    public void displayCart(){
        if (products.isEmpty()){
            System.out.println("No Products available");
        }
        else {
            for (Product p : products) {
                System.out.print("ID: " + p.getId() + " " +
                        "\nName: " + p.getName() + " " +
                        "\nPrice: " + p.getPrice() + " \n\n");
            }
        }
    }

    public void calculateTotal(){
        int total = products.stream().mapToInt(Product::getPrice).sum();
        System.out.println("Total Price: " + total);
    }
}