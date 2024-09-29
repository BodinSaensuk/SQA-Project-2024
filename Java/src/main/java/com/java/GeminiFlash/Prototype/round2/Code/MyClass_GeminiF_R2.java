package com.java.GeminiFlash.Prototype.round2.Code;

public class MyClass_GeminiF_R2 implements Cloneable {
    private String attribute;

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public Object clone() {
        try {
            return super.clone(); // คลอนวัตถุ
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported.", e);
        }
    }
}
