package com.java.ChatGPTFree.Prototype.round3.Code;

public abstract class Shape_Chat_R3 implements Cloneable {
    private String id;
    protected String type;
    
    abstract void draw();
    
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Clone method implementing Prototype Pattern
    public Shape_Chat_R3 clone() {
        Shape_Chat_R3 clone = null;
        try {
            clone = (Shape_Chat_R3) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

