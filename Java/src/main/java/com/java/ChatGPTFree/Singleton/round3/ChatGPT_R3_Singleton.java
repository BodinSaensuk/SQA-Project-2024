package com.java.ChatGPTFree.Singleton.round3;

import java.util.HashMap;
import java.util.Map;

public class ChatGPT_R3_Singleton {
    // Private static instance of the class
    private static ChatGPT_R3_Singleton instance;

    // Private map to store configuration settings
    private Map<String, String> settings;

    // Private constructor to prevent instantiation
    private ChatGPT_R3_Singleton() {
        settings = new HashMap<>();
        // Load default settings
        settings.put("appName", "My Application");
        settings.put("version", "1.0");
    }

    // Public method to provide access to the instance
    public static ChatGPT_R3_Singleton getInstance() {
        if (instance == null) {
            instance = new ChatGPT_R3_Singleton();
        }
        return instance;
    }

    // Method to get a setting
    public String getSetting(String key) {
        return settings.get(key);
    }

    // Method to set a setting
    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
