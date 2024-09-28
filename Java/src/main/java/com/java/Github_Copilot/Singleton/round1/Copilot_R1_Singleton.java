package com.java.Github_Copilot.Singleton.round1;

public class Copilot_R1_Singleton {
    private static Copilot_R1_Singleton instance;

    private Copilot_R1_Singleton() {
        // private constructor to prevent instantiation
    }

    public static Copilot_R1_Singleton getInstance() {
        if (instance == null) {
            instance = new Copilot_R1_Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return "Hello, Singleton!";
    }

    public void doSomething() {
        System.out.println("Doing something in Singleton");
    }
}