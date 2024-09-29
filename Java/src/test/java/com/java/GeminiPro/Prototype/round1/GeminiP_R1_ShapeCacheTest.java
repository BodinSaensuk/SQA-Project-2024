package com.java.GeminiPro.Prototype.round1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class GeminiP_R1_ShapeCacheTest {

    @BeforeEach
    void setUp() {
        ShapeCache_GeminiP_R1.loadCache(); // เปลี่ยนไปใช้ชื่อคลาสที่ถูกต้อง
    }

    @Test
    void testGetShape_Rectangle() {
        // Arrange
        String shapeId = "1";

        // Act
        ShapeCache_GeminiP_R1 clonedShape = ShapeCache_GeminiP_R1.getShape(shapeId); // เปลี่ยนไปใช้ชื่อคลาสที่ถูกต้อง

        // Assert
        assertEquals("Rectangle", clonedShape.getType()); // ตรวจสอบให้แน่ใจว่าใช้ getter
        assertNotSame(ShapeCache_GeminiP_R1.getShape(shapeId), clonedShape); // Ensure cloning
    }

    @Test
    void testGetShape_Square() {
        // Arrange
        String shapeId = "2";

        // Act
        ShapeCache_GeminiP_R1 clonedShape = ShapeCache_GeminiP_R1.getShape(shapeId); // เปลี่ยนไปใช้ชื่อคลาสที่ถูกต้อง

        // Assert
        assertEquals("Square", clonedShape.getType()); // ตรวจสอบให้แน่ใจว่าใช้ getter
        assertNotSame(ShapeCache_GeminiP_R1.getShape(shapeId), clonedShape); // Ensure cloning
    }

    // Add more tests to cover edge cases or additional shapes if needed
}
