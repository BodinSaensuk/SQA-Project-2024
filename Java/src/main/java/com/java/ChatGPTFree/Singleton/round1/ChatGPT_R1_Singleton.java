package com.java.ChatGPTFree.Singleton.round1;

// Singleton.java
public class ChatGPT_R1_Singleton {
    private static ChatGPT_R1_Singleton instance;

    // Private constructor prevents instantiation from other classes
    private ChatGPT_R1_Singleton() {
    }

    // Method to provide access to the Singleton instance
    public static ChatGPT_R1_Singleton getInstance() {
        if (instance == null) {
            instance = new ChatGPT_R1_Singleton();
        }
        return instance;
    }
}
