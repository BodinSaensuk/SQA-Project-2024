package com.java.ChatGPTFree.Prototype.round3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.foreign.MemorySegment.Scope;

public class Chat_R3_ShapeTest {

    @BeforeAll
    public static void setUp() {
        // Load shape cache before running tests
        ShapeCache.loadCache();
    }

    // Test for Rectangle Cloning
    @Test
    public void testRectangleClone() {
        // Arrange
        Shape originalRectangle = ShapeCache.getShape("2");
        
        // Act
        Shape clonedRectangle = ShapeCache.getShape("2");
        
        // Assert
        assertNotSame(originalRectangle, clonedRectangle); // Different object references
        assertEquals("Rectangle", clonedRectangle.getType()); // Same type
    }

    // Test for Circle Cloning
    @Test
    public void testCircleClone() {
        // Arrange
        Shape originalCircle = ShapeCache.getShape("1");
        
        // Act
        Shape clonedCircle = ShapeCache.getShape("1");

        // Assert
        assertNotSame(originalCircle, clonedCircle); // Different object references
        assertEquals("Circle", clonedCircle.getType()); // Same type
    }

    // Test for Rectangle Drawing
    @Test
    public void testRectangleDraw() {
        // Arrange
        Shape rectangle = ShapeCache.getShape("2");
        
        // Act & Assert
        assertDoesNotThrow(rectangle::draw);
    }

    // Test for Circle Drawing
    @Test
    public void testCircleDraw() {
        // Arrange
        Shape circle = ShapeCache.getShape("1");
        
        // Act & Assert
        assertDoesNotThrow(circle::draw);
    }
}

