package com.java.ChatGPTFree.Prototype.round3.Code;

import java.util.Hashtable;

public class ShapeCache_Chat_R3 {
    private static Hashtable<String, Shape_Chat_R3> shapeMap = new Hashtable<>();

    public static Shape_Chat_R3 getShape(String shapeId) {
        Shape_Chat_R3 cachedShape = shapeMap.get(shapeId);
        return (Shape_Chat_R3) cachedShape.clone();
    }

    // Load initial shapes into cache
    public static void loadCache() {
        Circle_Chat_R3 circle = new Circle_Chat_R3();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle_Chat_R3 rectangle = new Rectangle_Chat_R3();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
