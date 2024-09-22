// Shape Interface (Prototype)
interface Shape extends Cloneable {
    Shape clone();
    double calculateArea();
}

// Concrete Implementations (Clones)
class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor, getters, setters, calculateArea, clone implementation ...

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);   
 
        }
    }
}

class Circle implements Shape {
    private double radius;

    // Constructor, getters, setters, calculateArea, clone implementation ...

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);   
 
        }
    }
}

// Code Generation (Illustrative)
public class ShapeCodeGenerator {
    public static void main(String[] args) {
        Shape rectanglePrototype = new Rectangle(5, 3);
        Shape clonedRectangle = rectanglePrototype.clone();

        Shape circlePrototype = new Circle(2);
        Shape clonedCircle = circlePrototype.clone();

        // ... further use of cloned shapes
    }
}