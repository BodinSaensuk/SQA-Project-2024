package com.java.ChatGPTFree.Singleton.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    @Test
    void testGetInstance() {
        // Arrange
        ChatGPT_R2_Singleton firstInstance;

        // Act
        firstInstance = ChatGPT_R2_Singleton.getInstance();
        ChatGPT_R2_Singleton secondInstance = ChatGPT_R2_Singleton.getInstance();

        // Assert
        assertNotNull(firstInstance); // Ensure the instance is not null
        assertSame(firstInstance, secondInstance); // Ensure both references point to the same instance
    }

    @Test
    void testGetConnectionStatus() {
        // Arrange
        ChatGPT_R2_Singleton dbConnection = ChatGPT_R2_Singleton.getInstance();

        // Act
        String status = dbConnection.getConnectionStatus();

        // Assert
        assertEquals("Database connection established.", status); // Check the connection status
    }
}
