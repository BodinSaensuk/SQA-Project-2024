package com.java.GeminiPro.Prototype.round3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeminiP_R3_ProductCacheTest {

    @BeforeAll
    static void setUp() {
        ProductCache.loadCache();
    }

    @Test
    void testGetLaptop() {
        // Arrange
        String productId = "1";

        // Act
        Prototype clonedProduct = ProductCache.getProduct(productId);

        // Assert
        assertTrue(clonedProduct instanceof ProductCache_GeminiP_R3);
        assertEquals("Laptop", ((ProductCache_GeminiP_R3) clonedProduct).getName());
        assertEquals(1200.0, ((ProductCache_GeminiP_R3) clonedProduct).getPrice());
    }

    @Test
    void testGetPhone() {
        // Arrange
        String productId = "2";

        // Act
        Prototype clonedProduct = ProductCache.getProduct(productId);

        // Assert
        assertTrue(clonedProduct instanceof ProductCache_GeminiP_R3);
        assertEquals("Smartphone", ((ProductCache_GeminiP_R3) clonedProduct).getName());
        assertEquals(800.0, ((ProductCache_GeminiP_R3) clonedProduct).getPrice());
    }

    @Test
    void testCloneIndependence() {
        // Arrange
        String productId = "1";

        // Act
        Prototype clonedProduct1 = ProductCache.getProduct(productId);
        Prototype clonedProduct2 = ProductCache.getProduct(productId);
        ((ProductCache_GeminiP_R3) clonedProduct1).setPrice(1500.0);

        // Assert
        assertNotSame(clonedProduct1, clonedProduct2); // Ensure they are different objects
        assertNotEquals(((ProductCache_GeminiP_R3) clonedProduct1).getPrice(), ((ProductCache_GeminiP_R3) clonedProduct2).getPrice());
    }

    @Test
    void testInvalidProductId() {
        // Arrange
        String productId = "3"; // Non-existent product

        // Act
        Prototype clonedProduct = ProductCache.getProduct(productId);

        // Assert
        assertNull(clonedProduct); // Ensure that null is returned for invalid ID
    }
}
