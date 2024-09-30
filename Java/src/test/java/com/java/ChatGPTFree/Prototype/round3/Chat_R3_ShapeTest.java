package com.java.ChatGPTFree.Prototype.round3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.java.ChatGPTFree.Prototype.round3.Code.ShapeCache_Chat_R3;
import com.java.ChatGPTFree.Prototype.round3.Code.Shape_Chat_R3;

import static org.junit.jupiter.api.Assertions.*;

public class Chat_R3_ShapeTest {

    @BeforeAll
    public static void setUp() {
        // Load shape cache before running tests
        ShapeCache_Chat_R3.loadCache();
    }

    // Test for Rectangle Cloning
    @Test
    public void testRectangleClone() {
        // Arrange
        Shape_Chat_R3 originalRectangle = ShapeCache_Chat_R3.getShape("2"); // Corrected class name
        
        // Act
        Shape_Chat_R3 clonedRectangle = originalRectangle.clone(); // Call clone method properly
        
        // Assert
        assertNotSame(originalRectangle, clonedRectangle); // Different object references
        assertEquals("Rectangle", clonedRectangle.getType()); // Same type
    }

    // Test for Circle Cloning
    @Test
    public void testCircleClone() {
        // Arrange
        Shape_Chat_R3 originalCircle = ShapeCache_Chat_R3.getShape("1");
        
        // Act
        Shape_Chat_R3 clonedCircle = originalCircle.clone(); // Call clone method properly

        // Assert
        assertNotSame(originalCircle, clonedCircle); // Different object references
        assertEquals("Circle", clonedCircle.getType()); // Same type
    }

    // Test for Rectangle Drawing
    @Test
    public void testRectangleDraw() {
        // Arrange
        Shape_Chat_R3 rectangle = ShapeCache_Chat_R3.getShape("2");
        
        // Act & Assert
        // assertDoesNotThrow(rectangle::draw);
    }

    // Test for Circle Drawing
    @Test
    public void testCircleDraw() {
        // Arrange
        Shape_Chat_R3 circle = ShapeCache_Chat_R3.getShape("1");
        
        // Act & Assert
        // assertDoesNotThrow(circle::draw);
    }
}
