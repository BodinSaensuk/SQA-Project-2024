package com.java.GeminiPro.Singleton.round3;

public class GeminiP_R3_Singleton {

    private GeminiP_R3_Singleton() {
    }

    private static class SingletonHolder {
        private static final GeminiP_R3_Singleton INSTANCE = new GeminiP_R3_Singleton();
    }

    public static GeminiP_R3_Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // Example method to showcase functionality
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}