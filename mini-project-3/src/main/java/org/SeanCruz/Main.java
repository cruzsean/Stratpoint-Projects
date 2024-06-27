package org.SeanCruz;

import org.SeanCruz.model.Product;
import org.SeanCruz.service.implement.Cart;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product product = new Product("12345", "Laptop", 100000);
        Cart cart = new Cart();

        String choice;
        String userChoice;
        try {
                displayChoices();
                choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println(product.getId() + product.getName() + product.getPrice());
                        displayUserChoices();
                        userChoice = scan.nextLine();
                        switch (userChoice){
                            case "1":
                                System.out.println("Select the Product Title you want to add:");
                                
                        }
                        break;
                    case "2":
                        displayAdminChoices();
                        break;
                    case "3":
                        System.out.println("Thank you and Goodbye!");
                        break;
                }

        }catch (Exception e){
            System.out.println("Invalid Choice, Please try again");
        }
    }

    public static void displayChoices(){
        System.out.println("Welcome to E-commerce cart system");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
    }

    public static void displayAdminChoices(){
        System.out.println("1. Add a Product");
        System.out.println("2. Remove a Product");
        System.out.println("3. Search a Product");
        System.out.println("4. Update a Product Details");
        System.out.println("5. Exit");
    }

    public static void displayUserChoices(){
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove from Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Exit");
    }
}