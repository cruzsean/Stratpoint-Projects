package com.SeanCruz;

import com.SeanCruz.model.Book;
import junit.framework.TestCase;

public class BookTest extends TestCase {

    public void testBookConstructorAndGetters() {
        Book book = new Book("Test Book", "Test Author", "1234567890");
        assertEquals("Test Book", book.getTitle());
        assertEquals("Test Author", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
    }

    public void testBookSetters() {
        Book book = new Book("Test Book", "Test Author", "1234567890");
        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setISBN("0987654321");
        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals("0987654321", book.getISBN());
    }

}