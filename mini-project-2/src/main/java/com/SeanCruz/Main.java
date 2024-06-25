package com.SeanCruz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();
        String choice;
    do {
        displayChoices();
        choice = scan.nextLine();
        try {
            switch (choice){
                case "1":
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
                    break;
                case "2":
                    System.out.println("Please enter the TITLE of the book you want to remove");
                    String inputTitle = scan.nextLine();
                    library.removeBooks(inputTitle);
                    break;
                case "3":
                    System.out.println("Enter the book title you want to search:");
                    String searchTitle = scan.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case "4":
                    System.out.println("These are all the current books in the library:\n");
                    library.listAllBook();
                    break;
                case "5":
                    System.out.println("Exit");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please enter a valid choice.");
        }
    }while(!choice.equalsIgnoreCase("5"));
        scan.close();
    }
    //Displays the main menu choices for the user
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
    //Display what type of books the user wants.
    public static void displaytypes(){
        System.out.println("\nPlease Enter what kind of book do you want to add: ");
        System.out.println("1. E-book");
        System.out.println("2. Physical Book");
    }


}
