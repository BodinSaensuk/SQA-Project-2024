package GeminiFlash.Singleton.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test_GeminiF_R2_Singleton {
    @Test
    public void testSingletonInstance() {
        // Arrange
        GeminiF_R2_Singleton singleton1 = GeminiF_R2_Singleton.getInstance();
        GeminiF_R2_Singleton singleton2 = GeminiF_R2_Singleton.getInstance();

        // Act
        // No actions required for the Singleton pattern itself

        // Assert
        assertSame(singleton1, singleton2);
    }
}