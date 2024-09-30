package com.java.GeminiPro.Prototype.round1.Code;

import java.util.Hashtable;

public class ShapeCache_GeminiP_R1 {
    private static Hashtable<String, Shape_GeminiP_R1> shapeMap = new Hashtable<>();

    public static Shape_GeminiP_R1 getShape(String shapeId) {
        Shape_GeminiP_R1 cachedShape = shapeMap.get(shapeId);
        return (Shape_GeminiP_R1) cachedShape.clone();
    }

    // Load cache
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        shapeMap.put("1", rectangle);

        Square square = new Square();
        shapeMap.put("2", square);
    }
}
