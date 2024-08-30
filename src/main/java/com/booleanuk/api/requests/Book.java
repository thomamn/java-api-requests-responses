package com.booleanuk.api.requests;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

    private String title;
    private int numPages;
    private String author;
    private String genre;
    int id=0;



    public Book(String title, int numPages, String author, String genre){
        this.title=title;
        this.numPages=numPages;
        this.author=author;
        this.genre=genre;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
