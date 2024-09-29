package com.java.GeminiFlash.Prototype.round3;

import org.junit.jupiter.api.Test;

import com.java.GeminiFlash.Prototype.round3.Code.Person_GeminiF_R3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame; // นำเข้า assertNotSame

class GeminiF_R3_PersonTest {

    @Test
    void testCloning() {
        // Arrange
        Person_GeminiF_R3 originalPerson = new Person_GeminiF_R3("John Doe", 30);

        // Act
        Person_GeminiF_R3 clonedPerson = originalPerson.clone();

        // Assert
        assertEquals(originalPerson.getName(), clonedPerson.getName());
        assertEquals(originalPerson.getAge(), clonedPerson.getAge());
        assertNotSame(originalPerson, clonedPerson); // Ensure they are different objects
    }

    // ... Add more tests for other methods and edge cases ...
}
