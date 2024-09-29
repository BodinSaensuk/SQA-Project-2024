package com.java.ChatGPTFree.Prototype.round2.Code;

public class Circle_Chat_R2 implements Shape_Chat_R2 {
    @Override
    public Circle_Chat_R2 clone() {
        try {
            return (Circle_Chat_R2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    @Override
    public void draw() {
        // Implement the drawing logic here
        System.out.println("Drawing a Circle.");
    }
}
