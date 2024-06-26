package com.SeanCruz.model.BookTypes;

import com.SeanCruz.model.Book;

//Physical Book that inherits from Boom
public class PhysicalBook extends Book {

    public PhysicalBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    public static void callPhysicalBook() {
        System.out.println("This is a Physical Book");
    }
}
