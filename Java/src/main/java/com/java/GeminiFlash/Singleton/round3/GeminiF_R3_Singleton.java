package com.java.GeminiFlash.Singleton.round3;

public class GeminiF_R3_Singleton {
    private static volatile GeminiF_R3_Singleton instance;

    private GeminiF_R3_Singleton() {
        // Private constructor to prevent   
    }

    public static GeminiF_R3_Singleton getInstance() {
        if (instance == null) {
            synchronized (GeminiF_R3_Singleton.class) {
                if (instance == null) {
                    instance = new GeminiF_R3_Singleton();
                }
            }
        }
        return instance;
    }

    // Methods   
    public String getMessage() {
        return "Hello from Singleton!";
    }
}