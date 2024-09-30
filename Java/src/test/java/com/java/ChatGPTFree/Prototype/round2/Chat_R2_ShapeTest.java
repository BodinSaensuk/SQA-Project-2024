package com.java.ChatGPTFree.Prototype.round2;

import org.junit.jupiter.api.Test;

import com.java.ChatGPTFree.Prototype.round2.Code.Circle_Chat_R2;
import com.java.ChatGPTFree.Prototype.round2.Code.Rectangle_Chat_R2;

import static org.junit.jupiter.api.Assertions.*;

public class Chat_R2_ShapeTest {

    // Step 1: Test for Rectangle
    @Test
    public void testRectangleClone() {
        // Arrange
        Rectangle_Chat_R2 originalRectangle = new Rectangle_Chat_R2(10, 20);
        
        // Act
        Rectangle_Chat_R2 clonedRectangle = (Rectangle_Chat_R2) originalRectangle.clone();

        // Assert
        assertNotSame(originalRectangle, clonedRectangle);
        assertEquals(10, clonedRectangle.getWidth());
        assertEquals(20, clonedRectangle.getHeight());
    }

    @Test
    public void testRectangleDraw() {
        // Arrange
        Rectangle_Chat_R2 rectangle = new Rectangle_Chat_R2(10, 20);
        
        // Act
        rectangle.draw();
        
        // Assert
        assertEquals(10, rectangle.getWidth());
        assertEquals(20, rectangle.getHeight());
    }

    // Step 2: Test for Circle
    @Test
    public void testCircleClone() {
        // Arrange
        Circle_Chat_R2 originalCircle = new Circle_Chat_R2(); // Assuming constructor takes a radius
        
        // Act
        Circle_Chat_R2 clonedCircle = (Circle_Chat_R2) originalCircle.clone();

        // Assert
        assertNotSame(originalCircle, clonedCircle);
        // assertEquals(15, clonedCircle.getRadius()); // Assuming a method getRadius()
    }

    @Test
    public void testCircleDraw() {
        // Arrange
        Circle_Chat_R2 circle = new Circle_Chat_R2();
        
        // Act
        circle.draw();
        
        // Assert
        // assertEquals(15, circle.getRadius()); // Assuming a method getRadius()
    }  
}
