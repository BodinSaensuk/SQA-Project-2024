import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ShapeCacheTest {

    @BeforeEach
    void setUp() {
        ShapeCache.loadCache();
    }

    @Test
    void testGetShape_Rectangle() {
        // Arrange
        String shapeId = "1";

        // Act
        Shape clonedShape = ShapeCache.getShape(shapeId);

        // Assert
        assertEquals("Rectangle", clonedShape.type);
        assertNotSame(ShapeCache.shapeMap.get(shapeId), clonedShape); // Ensure cloning
    }

    @Test
    void testGetShape_Square() {
        // Arrange
        String shapeId = "2";

        // Act
        Shape clonedShape = ShapeCache.getShape(shapeId);

        // Assert
        assertEquals("Square", clonedShape.type);
        assertNotSame(ShapeCache.shapeMap.get(shapeId), clonedShape); // Ensure cloning
    }

    // Add more tests to cover edge cases or additional shapes if needed
}