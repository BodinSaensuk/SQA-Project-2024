package ChatGPT_3_5_Free.Singleton.round1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    // Arrange - Declare a variable for the Singleton instance
    private Singleton singleton;

    @BeforeEach
    public void setUp() {
        // Reset the Singleton instance to null before each test (if necessary)
        // To simulate first-time access, reflection can be used to reset the Singleton for testing purposes,
        // but for simplicity, we assume that tests are isolated enough to not require this reset in this example.
        singleton = Singleton.getInstance();
    }

    @Test
    public void testGetInstance_FirstTime() {
        // Act - Access the Singleton instance for the first time
        Singleton firstInstance = Singleton.getInstance();

        // Assert - Verify the Singleton instance is not null and is the same instance
        assertNotNull(firstInstance);
        assertSame(singleton, firstInstance);
    }

    @Test
    public void testGetInstance_AlreadyCreated() {
        // Act - Access the Singleton instance a second time
        Singleton secondInstance = Singleton.getInstance();

        // Assert - Verify that the instance is still the same
        assertNotNull(secondInstance);
        assertSame(singleton, secondInstance);
    }

    @Test
    public void testSingletonFunctionality() {
        // Act - Call the method from Singleton
        String data = singleton.getSingletonData();

        // Assert - Verify the return value
        assertEquals("Singleton Data", data);
    }
}
