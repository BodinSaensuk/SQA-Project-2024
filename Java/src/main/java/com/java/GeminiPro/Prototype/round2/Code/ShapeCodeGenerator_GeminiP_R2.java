package com.java.GeminiPro.Prototype.round2.Code;

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
