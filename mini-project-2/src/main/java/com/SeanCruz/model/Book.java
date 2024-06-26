package com.SeanCruz.model;


public class Book {

    private String title;
    private String author;
    private String ISBN;
    //Constructor  initializes book values
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    //Getters and Setters
    public void setTitle(String title ){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

}

