package com.SeanCruz;

import com.SeanCruz.model.Product;
import com.SeanCruz.service.implement.Admin;
import com.SeanCruz.service.implement.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    /**
     * Main class that implements an E-commerce system with user and admin functionalities.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Admin admin = new Admin();
        Cart cart = new Cart();

        //Pre Populate the product list
        admin.addProducts(new Product("1", "Laptop", 1000));
        admin.addProducts(new Product("2", "Phone", 500));
        admin.addProducts(new Product("3", "Tablet", 300));
        //Choices variable declaration
        String choice;
        try {
            do {
                displayChoices();
                choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        handleUserChoice(scan, cart);
                        break;
                    case "2":
                        handleAdminChoice(scan, admin);
                        break;
                    case "3":
                        System.out.println("Thank you and Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice, Please Try Again");
                }
            }while(!choice.equals("3"));
        }catch (Exception e){
            System.out.println("Invalid Choice, Please try again");
        }
    }

    /**
     * Display the menu choices
     */
    public static void displayChoices(){
        System.out.println("====================================");
        System.out.println("Welcome to E-commerce cart system");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.println("====================================");
    }

    /**
     * Display the Admin Choices
     */
    public static void displayAdminChoices(){
        System.out.println("====================================");
        System.out.println("1. Add a Product");
        System.out.println("2. Remove a Product");
        System.out.println("3. List all Products");
        System.out.println("4. Back to Main Menu");
        System.out.println("====================================");
    }

    /**
     * Display the Users Choice
     */
    public static void displayUserChoices(){
        System.out.println("====================================");
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove from Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Back to Main Menu");
        System.out.println("====================================");
    }

    /**
     * @param scan contains the scanner
     * @param cart contains the cart object
     * Handles the users choice
     */
    public static void handleUserChoice(Scanner scan, Cart cart){
        String userChoice;
        try {
            do {
                displayUserChoices();
                userChoice= scan.nextLine();

                switch (userChoice) {
                    case "1":
                        Admin.listProducts();
                        System.out.println("Select the Product ID you want to add:");
                        String addId = scan.nextLine();
                        Product product = Admin.searchProducts(addId);
                        if (product != null) {
                            cart.addCart(product);
                            System.out.println("Product successfully added to cart");
                        } else {
                            System.out.println("Product not found");
                        }
                        log.info("Added to Users Cart");
                        break;
                    case "2":
                        System.out.println("Select the Product ID you want to remove:");
                        String removeId = scan.nextLine();
                        cart.removeCart(removeId);
                        log.info("Removed from Users Cart");
                        break;
                    case "3":
                        System.out.println("There are the current products in your cart:");
                        cart.displayCart();
                        log.info("Viewed the Users cart");
                        break;
                    case "4":
                        cart.calculateTotal();
                        log.info("Calculated the Users Total Price");
                        break;
                    case "5":
                        System.out.println("Returning to main menu");
                        log.info("Back to Main menu");
                        break;
                    default:
                        System.out.println("Invalid choice, please try again");
                        log.info("Invalid Input");
                }
            } while (!userChoice.equals("5"));
        }catch (Exception e){
            System.out.println("Invalid input, please try again");
        }
    }

    /**
     * Handles the Admins Choices
     */
    public static void handleAdminChoice(Scanner scan, Admin admin){
        String adminChoice;
        try {
            do {
                displayAdminChoices();
                adminChoice = scan.nextLine();
                switch (adminChoice) {
                    case "1":
                        addProduct(scan, admin);
                        log.info("Added a Product");
                        break;
                    case "2":
                        System.out.println("Enter the Product Name you want to remove");
                        String inputID = scan.nextLine();
                        admin.removeProducts(inputID);
                        log.info("Removed a Product");
                        break;
                    case "3":
                        admin.listProducts();
                        log.info("Listed the Product");
                        break;
                    case "4":
                        System.out.println("Returning to Main Menu");
                        log.info("Returned to Main Manu");
                        return;
                    default:
                        log.warn("Invalid Input");
                        System.out.println("Invalid choice, please try again");
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Invalid input, please try again");
        }
    }

    /**
     * @param scan scanner object
     * @param admin admin object
     *  Adds a product to the admins product's list
     */
    public static void addProduct(Scanner scan, Admin admin){
        System.out.println("Enter a Product id:");
        String id = scan.nextLine();
        //validation
        if (admin.searchProducts(id) != null) {
            System.out.println("Product with ID " + id + " already exists. Please use a different ID.");
            return; // Exit method if ID already exists
        }
        System.out.println("Enter a Product Name");
        String name = scan.nextLine();
        System.out.println("Enter a Product price");
        int price = Integer.parseInt(scan.nextLine());
        Product product = new Product(id, name, price);
        admin.addProducts(product);
    }

}
