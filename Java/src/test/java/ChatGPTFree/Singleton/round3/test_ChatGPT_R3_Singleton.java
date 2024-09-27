package ChatGPTFree.Singleton.round3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationTest {

    @Test
    void testGetInstance() {
        // Arrange
        ChatGPT_R3_Singleton firstInstance;

        // Act
        firstInstance = ChatGPT_R3_Singleton.getInstance();
        ChatGPT_R3_Singleton secondInstance = ChatGPT_R3_Singleton.getInstance();

        // Assert
        assertNotNull(firstInstance); // Ensure the instance is not null
        assertSame(firstInstance, secondInstance); // Ensure both references point to the same instance
    }

    @Test
    void testGetSetting() {
        // Arrange
        ChatGPT_R3_Singleton config = ChatGPT_R3_Singleton.getInstance();
        String expectedAppName = "My Application";

        // Act
        String appName = config.getSetting("appName");

        // Assert
        assertEquals(expectedAppName, appName); // Check the app name setting
    }

    @Test
    void testSetSetting() {
        // Arrange
        ChatGPT_R3_Singleton config = ChatGPT_R3_Singleton.getInstance();
        String key = "appName";
        String newValue = "New Application Name";

        // Act
        config.setSetting(key, newValue);
        String updatedValue = config.getSetting(key);

        // Assert
        assertEquals(newValue, updatedValue); // Ensure the value has been updated
    }
}
