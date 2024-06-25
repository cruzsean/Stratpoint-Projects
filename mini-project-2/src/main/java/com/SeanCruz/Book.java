package com.SeanCruz;

class Book {

    private String title;
    private String author;
    private String ISBN;
    //Constrctor  initializes book values
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
//Ebook that inherits from Book
class Ebook extends Book{

    public Ebook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    public static  void callEbook() {
        System.out.println("This is a Ebook: ");
    }

}
//Physical Book that inherits from Boom
class PhysicalBook extends Book{

    public PhysicalBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    public static void callPhysicalBook(){
        System.out.println("This is a Physical Book");
    }
}

