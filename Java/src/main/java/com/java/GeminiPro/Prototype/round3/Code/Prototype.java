package com.java.GeminiPro.Prototype.round3.Code;

// Abstract Prototype (Interface)
public interface Prototype extends Cloneable {
    Prototype clone();
    void display();
}
