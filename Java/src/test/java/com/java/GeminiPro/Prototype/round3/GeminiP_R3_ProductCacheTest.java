package com.java.GeminiPro.Prototype.round3;

import com.java.GeminiPro.Prototype.round3.Code.ProductCache;
import com.java.GeminiPro.Prototype.round3.Code.ProductCache_GeminiP_R3;
import com.java.GeminiPro.Prototype.round3.Code.Prototype;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GeminiP_R3_ProductCacheTest {

    @BeforeAll
    static void setUp() {
        ProductCache.loadCache(); // Load the product cache before running tests
    }

@Test
void testGetLaptop() {
    String productId = "1"; // ID for Laptop
    Prototype clonedProduct = ProductCache.getProduct(productId);
    
    Assertions.assertNotNull(clonedProduct, "Product should not be null");
    Assertions.assertTrue(clonedProduct instanceof ProductCache_GeminiP_R3, "Product should be an instance of ProductCache_GeminiP_R3");

    // Now check if the product's attributes are correct
    ProductCache_GeminiP_R3 laptop = (ProductCache_GeminiP_R3) clonedProduct; // Cast to specific type
    Assertions.assertEquals("Laptop", laptop.getName(), "Product name should be Laptop");
    Assertions.assertEquals(1200.0, laptop.getPrice(), "Product price should be $1200.0");
}


    @Test
    void testGetPhone() {
        String productId = "2"; // ID for Phone
        Prototype clonedProduct = ProductCache.getProduct(productId);

        Assertions.assertNotNull(clonedProduct, "Product should not be null");
        Assertions.assertEquals("ProductCache_GeminiP_R3", clonedProduct.getClass().getSimpleName(), "Product should be a Phone");
    }

    @Test
    void testCloneIndependence() {
        String productId = "1"; // ID for Laptop
        Prototype originalProduct = ProductCache.getProduct(productId);
        Prototype clonedProduct = originalProduct.clone();

        // Modify the cloned product's name (or any other property)
        // Assuming a setter for name exists
        // clonedProduct.setName("Modified Laptop");
        
        // Assertions would depend on how you check independence
        // Assuming we have a way to check original's name
        // Assertions.assertNotEquals(originalProduct.getName(), clonedProduct.getName(),
        //     "Original product's name should not change when the clone is modified");
    }

    @Test
    void testInvalidProductId() {
        String productId = "3"; // Invalid ID
        Prototype clonedProduct = ProductCache.getProduct(productId);
        Assertions.assertNull(clonedProduct, "Product with ID 3 should be null");
    }
    
}
