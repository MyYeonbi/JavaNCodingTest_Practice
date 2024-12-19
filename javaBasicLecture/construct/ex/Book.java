package javaBasicLecture.construct.ex;

public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author) {
        this(title, author, 1);
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void displayinfo(){
        System.out.println("Title: " + this.title+" Author: " + this.author+" Pages: " + this.pages);
    }
}
