import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductCacheTest {

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
        assertTrue(clonedProduct instanceof Product);
        assertEquals("Laptop", ((Product) clonedProduct).name);
        assertEquals(1200.0, ((Product) clonedProduct).price);
    }

    @Test
    void testGetPhone() {
        // Arrange
        String productId = "2";

        // Act
        Prototype clonedProduct = ProductCache.getProduct(productId);

        // Assert
        assertTrue(clonedProduct instanceof Product);
        assertEquals("Smartphone", ((Product) clonedProduct).name);
        assertEquals(800.0, ((Product) clonedProduct).price);
    }

    @Test
    void testCloneIndependence() {
        // Arrange
        String productId = "1";

        // Act
        Prototype clonedProduct1 = ProductCache.getProduct(productId);
        Prototype clonedProduct2 = ProductCache.getProduct(productId);
        ((Product) clonedProduct1).price = 1500.0;

        // Assert
        assertNotEquals(((Product) clonedProduct1).price, ((Product) clonedProduct2).price);
    }

    @Test
    void testInvalidProductId() {
        // Arrange
        String productId = "3"; // Non-existent product

        // Act & Assert
        assertThrows(NullPointerException.class, () -> ProductCache.getProduct(productId));
    }
}