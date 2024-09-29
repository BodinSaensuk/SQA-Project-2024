package com.java.ChatGPTFree.Prototype.round1;

import org.junit.jupiter.api.Test;

import com.java.ChatGPTFree.Prototype.round1.Code.Product_Chat_R1;

import static org.junit.jupiter.api.Assertions.*;


public class Chat_R1_ProductTest {

    @Test
    public void testCloneMethodCreatesDeepCopy() {
        // Arrange
        Product_Chat_R1 originalProduct = new Product_Chat_R1("Laptop", 1200.00);

        // Act
        Product_Chat_R1 clonedProduct = originalProduct.clone();

        // Assert
        assertNotSame(originalProduct, clonedProduct);  // Different objects
        assertEquals(originalProduct, clonedProduct);   // Same content
    }

    @Test
    public void testEqualityForSameProduct() {
        // Arrange
        Product_Chat_R1 product1 = new Product_Chat_R1("Phone", 800.00);
        Product_Chat_R1 product2 = new Product_Chat_R1("Phone", 800.00);

        // Act & Assert
        assertEquals(product1, product2);  // Should be equal
    }

    @Test
    public void testInequalityForDifferentProducts() {
        // Arrange
        Product_Chat_R1 product1 = new Product_Chat_R1("Tablet", 500.00);
        Product_Chat_R1 product2 = new Product_Chat_R1("Laptop", 1500.00);

        // Act & Assert
        assertNotEquals(product1, product2);  // Should not be equal
    }

    @Test
    public void testHashCodeConsistency() {
        // Arrange
        Product_Chat_R1 product = new Product_Chat_R1("Watch", 200.00);

        // Act & Assert
        assertEquals(product.hashCode(), product.hashCode());  // Same hashcode for same object
    }

    @Test
    public void testCloneEqualityForDifferentValues() {
        // Arrange
        Product_Chat_R1 originalProduct = new Product_Chat_R1("Headphones", 150.00);

        // Act
        Product_Chat_R1 clonedProduct = originalProduct.clone();

        // Assert
        clonedProduct = new Product_Chat_R1("Speakers", 250.00);
        assertNotEquals(originalProduct, clonedProduct);  // Different products after modification
    }
}
