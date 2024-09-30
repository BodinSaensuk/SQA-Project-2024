package com.java.GeminiPro.Prototype.round3.Code;

public class ProductCache_GeminiP_R3 implements Prototype {
    private String name;
    private double price;

    public ProductCache_GeminiP_R3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone(); // Correctly cast
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported.", e);
        }
    }

    @Override
    public void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
    
    // Getters for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
