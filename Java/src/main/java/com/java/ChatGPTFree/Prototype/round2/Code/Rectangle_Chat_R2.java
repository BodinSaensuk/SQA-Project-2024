package com.java.ChatGPTFree.Prototype.round2.Code; // แพ็กเกจของ Rectangle_Chat_R2

import com.java.ChatGPTFree.Prototype.round2.Code.Shape_Chat_R2; // อ้างอิงจากแพ็กเกจที่ถูกต้อง

public class Rectangle_Chat_R2 implements Shape_Chat_R2 {
    private int width;
    private int height;

    public Rectangle_Chat_R2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape_Chat_R2 clone() {
        return new Rectangle_Chat_R2(this.width, this.height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of width " + width + " and height " + height);
    }

    // Getters and Setters
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
