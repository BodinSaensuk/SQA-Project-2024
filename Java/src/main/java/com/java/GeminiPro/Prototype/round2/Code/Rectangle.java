package com.java.GeminiPro.Prototype.round2.Code;

public class Rectangle implements Shape_GeminiP_R2 {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
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
