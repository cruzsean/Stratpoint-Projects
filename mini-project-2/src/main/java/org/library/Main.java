package org.library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();
        String choice;
        do {
            displayChoices();
            choice = scan.nextLine();
            switch (choice){
                case "1":
                    System.out.println("\nPlease Add a Book ");

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
                    System.out.println("Your Book has been successfully removed!");
                    break;
                case "3":
                    System.out.println("Enter the book title you want to search:");
                    String searchTitle = scan.nextLine();
                    library.searchBook(searchTitle);
                    System.out.println("Your Book has been found!");
                    break;
                case "4":
                    System.out.println("These are all the current books in the library:\n" );
                    library.listAllBook();
                    break;
                case "5":
                    System.out.println("Exit");
                    break;
            }
        }while(!choice.equalsIgnoreCase("5"));
        scan.close();
    }

    public static void displayChoices(){
        System.out.println("\n\n========================================");
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

}
