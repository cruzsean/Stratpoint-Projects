package com.SeanCruz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    List<Book> books;

    //Initializes the books list
    public Library() {
        this.books= new ArrayList<>();
    }
    //Adds a book to the library
    public void addBooks(Book book){
        books.add(book);
    }
    //Removes a book from the library
    public void removeBooks(String title){
        Iterator<Book> it = books.iterator();
        boolean bookfound = false;
        while(it.hasNext()){
            Book b = it.next();
            if (b.getTitle().equals(title)){
                it.remove();
                System.out.println("Your book has been removed");
                bookfound = true;
            }
        }
        if(!bookfound)
            System.out.println("Book not found, Invalid Title");
    }
    //Search a book from the library
    public void searchBook(String title){
        boolean searchfound = false;
        for (Book b : books) {
            if (title.contains(b.getTitle())) {
                System.out.println("Your Book has been found!");
                System.out.print("Title: " + b.getTitle() + " " +
                        "\nAuthor: " + b.getAuthor() + " " +
                        "\nISBN: " + b.getISBN() + " \n");
                searchfound = true;
            }
        }
        if (!searchfound)
            System.out.println("Sorry, Book not found");
    }
    //List all the available books within the library
    public void listAllBook(){
        for (Book b: books) {
            System.out.print("Title: " + b.getTitle() + " " +
                    "\nAuthor: " + b.getAuthor()+ " " +
                    "\nISBN: " + b.getISBN()+ " \n\n" );

        }
    }
}
