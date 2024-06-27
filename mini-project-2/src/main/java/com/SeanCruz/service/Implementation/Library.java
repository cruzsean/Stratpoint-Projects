package com.SeanCruz.service.Implementation;

import com.SeanCruz.model.Book;
import com.SeanCruz.service.LibraryService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * The Library class implements the LibraryService interface and provides methods
 * to manage a collection of books.
 */
public class Library implements LibraryService {
    List<Book> books;

    //Initializes the books list
    public Library() {
        this.books= new ArrayList<>();
    }
    /**
     * Adds a book to the library.
     *
     * @param book The book to be added.
     */
    public void addBooks(Book book){
        books.add(book);
    }
    /**
     * Removes a book from the library by its title.
     * @param title The title of the book to be removed.
     */
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
    /**
     * Searches for a book in the library by its title.
     * @param title The title of the book to be searched for.
     */
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
    /**
     * Lists all the books currently in the library.
     */
    public void listAllBook(){
        for (Book b: books) {
            System.out.print("Title: " + b.getTitle() + " " +
                    "\nAuthor: " + b.getAuthor()+ " " +
                    "\nISBN: " + b.getISBN()+ " \n\n" );

        }
    }
    public List<Book> getBooks() {
        return books;
    }

}
