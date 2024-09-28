package com.java.Github_Copilot.Singleton.round1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Copilot_R1_SingletonTest {
    @Test
    public void testSingletonInstance() {
        // Arrange
        Copilot_R1_Singleton singleton1 = Copilot_R1_Singleton.getInstance();
        Copilot_R1_Singleton singleton2 = Copilot_R1_Singleton.getInstance();

        // Act
        // No actions required for the Singleton pattern itself

        // Assert
        assertSame(singleton1, singleton2); // Ensure both instances are the same
    }

    @Test
    public void testDoSomething() {
        // Arrange
        Copilot_R1_Singleton singleton = Copilot_R1_Singleton.getInstance();

        // Act
        singleton.doSomething();

        // Assert
        // Verify the expected behavior of the doSomething() method
    }

    @Test
    public void testGetMessage() {
        // Arrange
        Copilot_R1_Singleton singleton = Copilot_R1_Singleton.getInstance();

        // Act
        String message = singleton.getMessage();

        // Assert
        assertEquals("Hello, Singleton!", message);
    }
}