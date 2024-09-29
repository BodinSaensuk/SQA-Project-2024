package com.java.Github_Copilot.Prototype.round1.Code;

// Book.java
public class Book_Copilot_R1 implements ProtoType_Copilot_R1 {
    private String title;
    private String author;
    private String genre;

    public Book_Copilot_R1(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public Book_Copilot_R1 clone() {
        return new Book_Copilot_R1(this.title, this.author, this.genre);
    }
}
