package org.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        this.books= new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public void removeBooks(String title){
        books.removeIf(book -> book.getTitle().contains(title));
    }

    public void searchBook(String title){
        for (Book b: books){
            if(title.contains(b.getTitle())){
                System.out.print("Title: " + b.getTitle() + " " +
                        "\nAuthor: " + b.getAuthor()+ " " +
                        "\nISBN: " + b.getISBN()+ " \n\n" );
            }
        }
    }
    public void listAllBook(){
        for (Book b: books) {
            System.out.print("Title: " + b.getTitle() + " " +
                    "\nAuthor: " + b.getAuthor()+ " " +
                    "\nISBN: " + b.getISBN()+ " \n\n" );

        }
    }
}
