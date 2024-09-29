package com.java.ChatGPTFree.Singleton.round2;

public class ChatGPT_R2_Singleton {
    // Private static instance of the class
    private static ChatGPT_R2_Singleton instance;

    // Private constructor to prevent instantiation
    private ChatGPT_R2_Singleton() {
        // Simulate establishing a connection to a database
        System.out.println("Connecting to database...");
    }

    // Public method to provide access to the instance
    public static ChatGPT_R2_Singleton getInstance() {
        if (instance == null) {
            instance = new ChatGPT_R2_Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public String getConnectionStatus() {
        return "Database connection established.";
    }
}