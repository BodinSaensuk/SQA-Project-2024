package com.java.GeminiPro.Singleton.round1;

public class GeminiP_R1_Singleton {

    private static GeminiP_R1_Singleton instance = null;

    // Private constructor to prevent external instantiation
    private GeminiP_R1_Singleton() {
        // ... initialization logic if needed
    }

    public static GeminiP_R1_Singleton getInstance() {
        if (instance == null) {
            synchronized (GeminiP_R1_Singleton.class) {
                if (instance == null) {
                    instance = new GeminiP_R1_Singleton();
                }
            }
        }
        return instance;
    }

    // ... other methods of your singleton class
}