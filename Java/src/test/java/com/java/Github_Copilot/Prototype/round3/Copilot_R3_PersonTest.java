package com.java.Github_Copilot.Prototype.round3;

import org.junit.jupiter.api.Test;

import com.java.GeminiFlash.Prototype.round3.Code.Person_GeminiF_R3;

import static org.junit.jupiter.api.Assertions.*;

public class Copilot_R3_PersonTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        // Arrange
        Person_GeminiF_R3 original = new Person_GeminiF_R3("John Doe", 30);

        // Act
        Person_GeminiF_R3 clone = (Person_GeminiF_R3) original.clone();

        // Assert
        assertNotSame(original, clone);
        assertEquals(original.getName(), clone.getName());
        assertEquals(original.getAge(), clone.getAge());
    }

    @Test
    public void testSetName() {
        // Arrange
        Person_GeminiF_R3 person = new Person_GeminiF_R3("John Doe", 30);

        // Act
        person.setName("Jane Doe");

        // Assert
        assertEquals("Jane Doe", person.getName());
    }

    @Test
    public void testSetAge() {
        // Arrange
        Person_GeminiF_R3 person = new Person_GeminiF_R3("John Doe", 30);

        // Act
        person.setAge(25);

        // Assert
        assertEquals(25, person.getAge());
    }
}
