package com.SeanCruz.service;

import com.SeanCruz.model.Book;

public interface LibraryService {
    public void addBooks(Book book);
    public void removeBooks(String title);
    public void searchBook(String title);
    public void listAllBook();
}
