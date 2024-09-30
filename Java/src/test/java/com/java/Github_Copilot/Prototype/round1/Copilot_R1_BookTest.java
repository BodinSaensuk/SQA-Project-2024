package com.java.Github_Copilot.Prototype.round1;

// BookTest.java
import org.junit.jupiter.api.Test;

import com.java.Github_Copilot.Prototype.round1.Code.Book_Copilot_R1;

import static org.junit.jupiter.api.Assertions.*;

public class Copilot_R1_BookTest {

    @Test
    public void testClone() {
        // Arrange
        Book_Copilot_R1 originalBook = new Book_Copilot_R1("1984", "George Orwell", "Dystopian");

        // Act
        Book_Copilot_R1 clonedBook = originalBook.clone();

        // Assert
        assertNotSame(originalBook, clonedBook);
        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getGenre(), clonedBook.getGenre());
    }

    @Test
    public void testGetTitle() {
        // Arrange
        Book_Copilot_R1 book = new Book_Copilot_R1("1984", "George Orwell", "Dystopian");

        // Act
        String title = book.getTitle();

        // Assert
        assertEquals("1984", title);
    }

    @Test
    public void testGetAuthor() {
        // Arrange
        Book_Copilot_R1 book = new Book_Copilot_R1("1984", "George Orwell", "Dystopian");

        // Act
        String author = book.getAuthor();

        // Assert
        assertEquals("George Orwell", author);
    }

    @Test
    public void testGetGenre() {
        // Arrange
        Book_Copilot_R1 book = new Book_Copilot_R1("1984", "George Orwell", "Dystopian");

        // Act
        String genre = book.getGenre();

        // Assert
        assertEquals("Dystopian", genre);
    }
}