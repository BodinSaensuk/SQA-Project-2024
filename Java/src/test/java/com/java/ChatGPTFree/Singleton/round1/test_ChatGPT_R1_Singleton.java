package com.java.ChatGPTFree.Singleton.round1;

// SingletonTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test_ChatGPT_R1_Singleton { // เปลี่ยนชื่อคลาสทดสอบ

    @Test
    public void testSingletonInstanceNotNull() {
        // Arrange
        // Act
        ChatGPT_R1_Singleton instance = ChatGPT_R1_Singleton.getInstance();
        
        // Assert
        assertNotNull(instance); // Check that the instance is not null
    }

    @Test
    public void testSingletonInstanceSameReference() {
        // Arrange
        ChatGPT_R1_Singleton firstInstance = ChatGPT_R1_Singleton.getInstance();
        
        // Act
        ChatGPT_R1_Singleton secondInstance = ChatGPT_R1_Singleton.getInstance();
        
        // Assert
        assertSame(firstInstance, secondInstance); // Both instances should be the same
    }
}
