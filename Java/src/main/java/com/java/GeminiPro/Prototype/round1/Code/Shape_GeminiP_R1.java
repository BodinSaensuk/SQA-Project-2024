package com.java.GeminiPro.Prototype.round1.Code;

public abstract class Shape_GeminiP_R1 implements Cloneable {
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    @Override
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
class Rectangle extends Shape_GeminiP_R1 {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square extends Shape_GeminiP_R1 {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
