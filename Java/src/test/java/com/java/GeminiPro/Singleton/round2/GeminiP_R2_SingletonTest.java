package com.java.GeminiPro.Singleton.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeminiP_R2_SingletonTest {

    @Test
    public void testGreet() {
        // Arrange
        String name = "Bob";

        // Act
        String greeting = GeminiP_R2_Singleton.INSTANCE.greet(name);

        // Assert
        assertEquals("Hello, Bob!", greeting);
    }
}