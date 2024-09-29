package com.java.GeminiFlash.Prototype.round2;

import org.junit.Test;

import com.java.GeminiFlash.Prototype.round2.Code.MyClass_GeminiF_R2;

import static org.junit.Assert.*;

public class GeminiF_R2_MyClassTest {
    @Test
    public void testClone() {
        // Arrange
        MyClass_GeminiF_R2 prototype = new MyClass_GeminiF_R2();
        prototype.setAttribute("Prototype Value"); // ตั้งค่าแอตทริบิวต์ของโปรโตไทป์

        // Act
        MyClass_GeminiF_R2 instance = (MyClass_GeminiF_R2) prototype.clone();

        // Assert
        assertNotSame(prototype, instance); // ตรวจสอบว่า instance ไม่ใช่โปรโตไทป์เดียวกัน
        assertEquals(prototype.getAttribute(), instance.getAttribute()); // ตรวจสอบว่าค่าแอตทริบิวต์ตรงกัน
    }

    // ... other test cases
}
