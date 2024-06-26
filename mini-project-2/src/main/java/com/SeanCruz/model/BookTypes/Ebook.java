package com.SeanCruz.model.BookTypes;

import com.SeanCruz.model.Book;

//Ebook that inherits from Book
public class Ebook extends Book {

    public Ebook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    public static void callEbook() {
        System.out.println("This is a Ebook: ");
    }

}
