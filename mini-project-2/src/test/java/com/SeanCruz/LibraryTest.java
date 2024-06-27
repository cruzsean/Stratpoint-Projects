package com.SeanCruz.service.Implementation;

import com.SeanCruz.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Library class.
 */
public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBooks() {
        Book book = new Book("Test Title", "Test Author", "1234567890");
        library.addBooks(book);
        List<Book> books = library.getBooks();
        assertEquals(1, books.size(), "Book should be added to the library");
        assertEquals(book, books.get(0), "The added book should be in the library");
    }

    @Test
    public void testRemoveBooks() {
        Book book1 = new Book("Test Title 1", "Test Author 1", "1234567890");
        Book book2 = new Book("Test Title 2", "Test Author 2", "0987654321");
        library.addBooks(book1);
        library.addBooks(book2);
        library.removeBooks("Test Title 1");
        List<Book> books = library.getBooks();
        assertEquals(1, books.size(), "One book should be removed from the library");
        assertEquals(book2, books.get(0), "The remaining book should be the second book");
    }

    @Test
    public void testRemoveBooks_NotFound() {
        Book book = new Book("Test Title", "Test Author", "1234567890");
        library.addBooks(book);
        library.removeBooks("Non-Existent Title");
        List<Book> books = library.getBooks();
        assertEquals(1, books.size(), "No book should be removed if the title does not exist");
    }

    @Test
    public void testSearchBook_Found() {
        Book book = new Book("Test Title", "Test Author", "1234567890");
        library.addBooks(book);
        library.searchBook("Test Title");
        // This test only verifies that the method runs without exceptions.
        // You can add assertions to check the output if the method returns a result.
    }

    @Test
    public void testSearchBook_NotFound() {
        Book book = new Book("Test Title", "Test Author", "1234567890");
        library.addBooks(book);
        library.searchBook("Non-Existent Title");
        // This test only verifies that the method runs without exceptions.
        // You can add assertions to check the output if the method returns a result.
    }

    @Test
    public void testListAllBook() {
        Book book1 = new Book("Test Title 1", "Test Author 1", "1234567890");
        Book book2 = new Book("Test Title 2", "Test Author 2", "0987654321");
        library.addBooks(book1);
        library.addBooks(book2);
        library.listAllBook();
        // This test only verifies that the method runs without exceptions.
        // You can add assertions to check the output if the method returns a result.
    }
}
