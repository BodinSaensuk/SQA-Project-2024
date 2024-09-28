package com.java.GeminiFlash.Singleton.round2;

public class GeminiF_R2_Singleton {
    private static final GeminiF_R2_Singleton INSTANCE = new GeminiF_R2_Singleton();

    private GeminiF_R2_Singleton() {
        // Private constructor   

    }

    public static GeminiF_R2_Singleton getInstance() {
        return INSTANCE; 

    }
}