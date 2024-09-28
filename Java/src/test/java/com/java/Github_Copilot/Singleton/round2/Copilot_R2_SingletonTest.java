package com.java.Github_Copilot.Singleton.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Copilot_R2_SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Arrange
        Copilot_R2_Singleton singleton1 = Copilot_R2_Singleton.getInstance();
        Copilot_R2_Singleton singleton2 = Copilot_R2_Singleton.getInstance();

        // Act
        // No actions required for the Singleton pattern itself

        // Assert
        assertSame(singleton1, singleton2); // Ensure both instances are the same
    }

    @Test
    public void testGetMessage() {
        // Arrange
        Copilot_R2_Singleton singleton = Copilot_R2_Singleton.getInstance();

        // Act
        String message = singleton.getMessage();

        // Assert
        assertEquals("Hello from Singleton!", message); // Verify the expected message
    }
}