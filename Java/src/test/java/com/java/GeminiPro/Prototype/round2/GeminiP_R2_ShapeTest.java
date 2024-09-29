package com.java.GeminiPro.Prototype.round2;

import com.java.GeminiPro.Prototype.round2.Code.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeminiP_R2_ShapeTest {

    @Test
    public void testRectangleArea() {
        // Arrange
        Shape_GeminiP_R2 rectangle = new Rectangle(4, 6);

        // Act
        double area = rectangle.calculateArea();

        // Assert
        assertEquals(24, area);
    }

    @Test
    public void testCircleArea() {
        // Arrange
        Shape_GeminiP_R2 circle = new Circle(3);

        // Act
        double area = circle.calculateArea();

        // Assert
        assertEquals(28.274333882308138, area, 0.0001); // Using delta for approximate comparison
    }

    // ... More tests for other methods, edge cases, etc. to achieve 100% branch coverage
}
