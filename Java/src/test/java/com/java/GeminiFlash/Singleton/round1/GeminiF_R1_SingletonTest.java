package com.java.GeminiFlash.Singleton.round1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeminiF_R1_SingletonTest {
    @Test
    public void testGetInstance() {
        // Arrange
        GeminiF_R1_Singleton singleton1 = GeminiF_R1_Singleton.getInstance();
        GeminiF_R1_Singleton singleton2 = GeminiF_R1_Singleton.getInstance();

        // Act
        // Assert
        assertSame(singleton1, singleton2);
    }

    // Additional tests for the singleton's methods
}