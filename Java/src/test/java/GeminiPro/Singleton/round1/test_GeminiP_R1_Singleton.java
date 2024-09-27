package GeminiPro.Singleton.round1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class test_GeminiP_R1_Singleton {

    @Test
    public void testGetInstance() {
        // Arrange (nothing to arrange in this simple case)

        // Act
        GeminiP_R1_Singleton instance1 = GeminiP_R1_Singleton.getInstance();
        GeminiP_R1_Singleton instance2 = GeminiP_R1_Singleton.getInstance();

        // Assert
        assertNotNull(instance1); // Ensure instance is not null
        assertSame(instance1, instance2); // Verify same instance is returned
    }
}