package com.java.GeminiPro.Prototype.round2.Code;

// Shape Interface (Prototype)
interface Shape_GeminiP_R2 extends Cloneable {
    Shape_GeminiP_R2 clone(); // ใช้ชื่อให้สอดคล้อง
    double calculateArea();
}

// Concrete Implementations (Clones)
class Rectangle implements Shape_GeminiP_R2 {
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

class Circle implements Shape_GeminiP_R2 {
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

// Code Generation (Illustrative)
public class ShapeCodeGenerator_GeminiP_R2 {
    public static void main(String[] args) {
        Shape_GeminiP_R2 rectanglePrototype = new Rectangle(5, 3);
        Shape_GeminiP_R2 clonedRectangle = rectanglePrototype.clone();
        System.out.println("Area of cloned rectangle: " + clonedRectangle.calculateArea());

        Shape_GeminiP_R2 circlePrototype = new Circle(2);
        Shape_GeminiP_R2 clonedCircle = circlePrototype.clone();
        System.out.println("Area of cloned circle: " + clonedCircle.calculateArea());

        // ... further use of cloned shapes
    }
}
