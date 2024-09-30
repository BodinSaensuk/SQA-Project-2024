package com.java.Github_Copilot.Prototype.round2;

// VehicleTest.java
import org.junit.jupiter.api.Test;

import com.java.Github_Copilot.Prototype.round2.Code.Vehicle_Copilot_R2;

import static org.junit.jupiter.api.Assertions.*;

public class Copilot_R2_VehicleTest {

    @Test
    public void testClone() {
        // Arrange
        Vehicle_Copilot_R2 originalVehicle = new Vehicle_Copilot_R2("Toyota", "Camry", 2010);

        // Act
        Vehicle_Copilot_R2 clonedVehicle = originalVehicle.clone();

        // Assert
        assertNotSame(originalVehicle, clonedVehicle);
        assertEquals(originalVehicle.getMake(), clonedVehicle.getMake());
        assertEquals(originalVehicle.getModel(), clonedVehicle.getModel());
        assertEquals(originalVehicle.getYear(), clonedVehicle.getYear());
    }

    @Test
    public void testGetMake() {
        // Arrange
        Vehicle_Copilot_R2 vehicle = new Vehicle_Copilot_R2("Toyota", "Camry", 2010);

        // Act
        String make = vehicle.getMake();

        // Assert
        assertEquals("Toyota", make);
    }

    @Test
    public void testGetModel() {
        // Arrange
        Vehicle_Copilot_R2 vehicle = new Vehicle_Copilot_R2("Toyota", "Camry", 2010);

        // Act
        String model = vehicle.getModel();

        // Assert
        assertEquals("Camry", model);
    }

    @Test
    public void testGetYear() {
        // Arrange
        Vehicle_Copilot_R2 vehicle = new Vehicle_Copilot_R2("Toyota", "Camry", 2010);

        // Act
        int year = vehicle.getYear();

        // Assert
        assertEquals(2010, year);
    }
}
