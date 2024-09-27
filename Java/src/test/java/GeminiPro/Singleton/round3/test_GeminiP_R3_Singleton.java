package GeminiPro.Singleton.round3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class test_GeminiP_R3_Singleton {

    @Test
    public void testGetInstance() {
        // Arrange (not needed in this case)

        // Act
        GeminiP_R3_Singleton instance1 = GeminiP_R3_Singleton.getInstance();
        GeminiP_R3_Singleton instance2 = GeminiP_R3_Singleton.getInstance();

        // Assert
        assertSame(instance1, instance2); // Ensure it's the same instance
    }

    @Test
    public void testGreet() {
        // Arrange
        GeminiP_R3_Singleton instance = GeminiP_R3_Singleton.getInstance();
        String name = "David";

        // Act
        String greeting = instance.greet(name);

        // Assert
        assertEquals("Hello, David!", greeting);
    }
}