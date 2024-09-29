package com.java.GeminiPro.Prototype.round1.Code;

abstract class ShapeCache_GeminiP_R1 implements Cloneable {
    protected String type;

    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

// Concrete Prototypes
class Rectangle extends ShapeCache_GeminiP_R1 {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square extends ShapeCache_GeminiP_R1 {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

// // Shape Cache (Prototype Manager)
// class ShapeCache_GeminiP_R1 {
//     private static Hashtable<String, ShapeCache_GeminiP_R1> shapeMap = new Hashtable<>();

//     public static ShapeCache_GeminiP_R1 getShape(String shapeId) {
//         ShapeCache_GeminiP_R1 cachedShape = shapeMap.get(shapeId);
//         return (ShapeCache_GeminiP_R1) cachedShape.clone();
//     }

//     // Load cache
//     public static void loadCache() {
//         Rectangle rectangle = new Rectangle();
//         shapeMap.put("1", rectangle);

//         Square square = new Square();
//         shapeMap.put("2", square);
//     }
// }
