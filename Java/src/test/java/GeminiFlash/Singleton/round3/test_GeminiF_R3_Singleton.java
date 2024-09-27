package GeminiFlash.Singleton.round3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test_GeminiF_R3_Singleton {
    @Test
    public void testSingletonInstance() {
        // Arrange
        GeminiF_R3_Singleton singleton1 = GeminiF_R3_Singleton.getInstance();
        GeminiF_R3_Singleton singleton2 = GeminiF_R3_Singleton.getInstance();

        // Act
        // No actions required for the Singleton pattern itself

        // Assert
        assertSame(singleton1, singleton2);
    }

    @Test
    public void testGetMessage() {
        // Arrange
        GeminiF_R3_Singleton singleton = GeminiF_R3_Singleton.getInstance();

        // Act
        String message = singleton.getMessage();

        // Assert
        assertEquals("Hello from Singleton!", message);
    }
}