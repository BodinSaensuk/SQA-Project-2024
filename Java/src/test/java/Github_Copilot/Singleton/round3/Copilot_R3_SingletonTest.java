package Github_Copilot.Singleton.round3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Copilot_R3_SingletonTest {
    @Test
    public void testSingletonInstance() {
        // Arrange
        Copilot_R3_Singleton singleton1 = Copilot_R3_Singleton.getInstance();
        Copilot_R3_Singleton singleton2 = Copilot_R3_Singleton.getInstance();

        // Act
        // No actions required for the Singleton pattern itself

        // Assert
        assertSame(singleton1, singleton2); // Ensure both instances are the same
    }

    @Test
    public void testDoSomething() {
        // Arrange
        Copilot_R3_Singleton singleton = Copilot_R3_Singleton.getInstance();

        // Act
        singleton.doSomething();

        // Assert
        // Verify the expected behavior of the doSomething() method
    }

    @Test
    public void testGetMessage() {
        // Arrange
        Copilot_R3_Singleton singleton = Copilot_R3_Singleton.getInstance();

        // Act
        String message = singleton.getMessage();

        // Assert
        assertEquals("Hello, Singleton!", message);
    }
}
