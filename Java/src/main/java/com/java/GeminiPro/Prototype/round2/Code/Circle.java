package com.java.GeminiPro.Prototype.round2.Code;

public class Circle implements Shape_GeminiP_R2 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Shape_GeminiP_R2 clone() {
        try {
            return (Shape_GeminiP_R2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
