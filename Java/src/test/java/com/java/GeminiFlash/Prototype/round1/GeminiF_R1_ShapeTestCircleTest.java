package com.java.GeminiFlash.Prototype.round1;

import org.junit.jupiter.api.Test;

import com.java.GeminiFlash.Prototype.round1.Code.Circle_GeminiF_R1;

import static org.junit.jupiter.api.Assertions.*; // ต้องนำเข้าทั้งหมดที่ต้องการ

public class GeminiF_R1_ShapeTestCircleTest {
    @Test
    public void testClone() {
        Circle_GeminiF_R1 originalCircle = new Circle_GeminiF_R1(5); // แก้ไขเป็น Circle_GeminiF_R1
        Circle_GeminiF_R1 clonedCircle = (Circle_GeminiF_R1) originalCircle.clone();

        // Assert that the cloned circle is a separate object but has the same attributes
        assertNotSame(originalCircle, clonedCircle);
        assertEquals(originalCircle.getRadius(), clonedCircle.getRadius());
    }

    // ... other tests for different scenarios ...
}
