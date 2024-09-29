package com.java.GeminiFlash.Prototype.round1.Code;

public class Circle_GeminiF_R1 implements Shape_GeminiF_R1 {
    private int radius;

    public Circle_GeminiF_R1(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape_GeminiF_R1 clone() {
        return new Circle_GeminiF_R1(this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }
}
