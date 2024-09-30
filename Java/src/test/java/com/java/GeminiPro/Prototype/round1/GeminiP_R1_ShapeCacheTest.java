package com.java.GeminiPro.Prototype.round1;

import com.java.GeminiPro.Prototype.round1.Code.ShapeCache_GeminiP_R1;
import com.java.GeminiPro.Prototype.round1.Code.Shape_GeminiP_R1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class GeminiP_R1_ShapeCacheTest {

    @BeforeEach
    void setUp() {
        ShapeCache_GeminiP_R1.loadCache();
    }

    @Test
    void testGetShape_Rectangle() {
        // Arrange
        String shapeId = "1";

        // Act
        Shape_GeminiP_R1 clonedShape = ShapeCache_GeminiP_R1.getShape(shapeId);

        // Assert
        assertEquals("Rectangle", clonedShape.getType());
        assertNotSame(ShapeCache_GeminiP_R1.getShape(shapeId), clonedShape); // Ensure cloning
    }

    @Test
    void testGetShape_Square() {
        // Arrange
        String shapeId = "2";

        // Act
        Shape_GeminiP_R1 clonedShape = ShapeCache_GeminiP_R1.getShape(shapeId);

        // Assert
        assertEquals("Square", clonedShape.getType());
        assertNotSame(ShapeCache_GeminiP_R1.getShape(shapeId), clonedShape); // Ensure cloning
    }

    // Add more tests to cover edge cases or additional shapes if needed
}
