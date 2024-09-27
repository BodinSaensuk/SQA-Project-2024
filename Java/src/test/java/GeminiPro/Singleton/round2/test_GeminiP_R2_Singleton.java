package GeminiPro.Singleton.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_GeminiP_R2_Singleton {

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