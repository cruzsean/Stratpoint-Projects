package com.SeanCruz;
import com.SeanCruz.model.BookTypes.Ebook;
import com.SeanCruz.model.BookTypes.PhysicalBook;
import com.SeanCruz.model.Book;
import com.SeanCruz.service.Implementation.Library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The Main class is the entry point for the Library Management System application.
 * It provides a console-based interface for users to manage a collection of books.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Scanner scan = new Scanner(System.in);
    private static final Library library = new Library();
    /**
     * The main method that runs the application.
     */
    public static void main(String[] args) {
        String choice;
    do {
        displayChoices();
        choice = scan.nextLine();
        try {
            switch (choice){
                case "1":
                    addBook();
                    logger.info("Added Book");
                    break;
                case "2":
                    removeBook();
                    logger.info("Remove Book");
                    break;
                case "3":
                    searchBook();
                    logger.info("Search for Book");
                    break;
                case "4":
                    listAllBook();
                    logger.info("Listed Book");
                    break;
                case "5":
                    logger.info("Exiting the Application.");
                    System.out.println("Exit");
                    break;
                default:
                    logger.warn("Invalid Input");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please enter a valid choice.");
        }
    }while(!choice.equalsIgnoreCase("5"));
        scan.close();
    }

    /**
     * Displays the main menu choices for the user.
     */
    public static void displayChoices(){
        System.out.println("========================================");
        System.out.println("Welcome to the Library Management System");
        System.out.println("========================================");
        System.out.println("1. Add a book");
        System.out.println("2. Remove a book");
        System.out.println("3. Search a book");
        System.out.println("4. List all books");
        System.out.println("5. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");
    }
    /**
     * Displays the types of books the user can add.
     */
    public static void displaytypes(){
        System.out.println("\nPlease Enter what kind of book do you want to add: ");
        System.out.println("1. E-book");
        System.out.println("2. Physical Book");
    }
    /**
     * Displays the types of books the user can add.
     */
    public static void addBook(){
        String type;
        do {
            displaytypes();
            type = scan.nextLine();
            if (type.equals("1")) {
                Ebook.callEbook();
            } else if (type.equals("2")) {
                PhysicalBook.callPhysicalBook();
            } else {
                System.out.println("Invalid choice, Please Try Again");
            }
        } while (!type.equals("1") && !type.equals("2"));

        System.out.print("Enter Your Title: ");
        String title = scan.nextLine();

        System.out.print("Enter the Author: ");
        String author = scan.nextLine();

        System.out.print("Enter your ISBN: ");
        String ISBN = scan.nextLine();

        System.out.println("Your Book has been successfully added!");

        library.addBooks(new Book(title, author, ISBN));
    }
    /**
     * Handles the process of removing a book from the library.
     */
    public static void removeBook(){
        System.out.println("Please enter the TITLE of the book you want to remove");
        String inputTitle = scan.nextLine();
        library.removeBooks(inputTitle);
    }
    /**
     * Handles the process of searching for a book in the library.
     */
    public static void searchBook(){
        System.out.println("Enter the book title you want to search:");
        String searchTitle = scan.nextLine();
        library.searchBook(searchTitle);
    }
    /**
     * Handles the process of listing all books in the library.
     */
    public static void listAllBook(){
        System.out.println("These are all the current books in the library:\n");
        library.listAllBook();
    }

}
