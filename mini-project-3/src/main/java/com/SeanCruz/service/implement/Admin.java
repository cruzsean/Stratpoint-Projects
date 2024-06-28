package com.SeanCruz.service.implement;

import com.SeanCruz.model.Product;
import com.SeanCruz.service.AdminServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Admin implements AdminServices {
    private static List<Product> products;
    static boolean productFound = false;

    public Admin() {
        products = new ArrayList<>();
    }
    public void addProducts(Product product){
            products.add(product);
    }

    public void removeProducts(String ID){
        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if (product.getId().contains(ID)){
                iterator.remove();
                System.out.println("Your selected Product has been removed");
                productFound = true;
            }
        }
        if(!productFound)
            System.out.println("Product not found, Invalid Name");

    }
    public static void listProducts(){
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

    public static Product searchProducts(String id){
        Optional<Product> product = products.stream().filter(p -> p.getId().equals(id)).findFirst();
        return product.orElse(null);
    }
}
