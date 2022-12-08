package com.example;

/*
 * There are many excellent 3rd party libraries that will handle converting jsons into jave objects and 
 * vice versa. HOWEVER, in order to make use of most of these libraries, many of them require you to set up your
 * class in a specific way: they require the Java bean design pattern. 
 * 
 * The Jave Bean design pattern has just a few requirements:
 *  - All fields must be private (not public)
 *  - All fields must have getter and setter methods to interact with them
 */
public class Book {

    /*
     * So far we have been using the public access modifier: to make a class a java bean though, all fields
     * must be set to private: this means that they are only accessible by code within the class itself. 
     */

    // Private is the access modifier
    private String title;
    private String author;
    private String genre;
    private int isbn;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    


}
