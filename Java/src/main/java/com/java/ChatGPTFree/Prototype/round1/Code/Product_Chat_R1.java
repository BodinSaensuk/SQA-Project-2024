package com.java.ChatGPTFree.Prototype.round1.Code;

import java.util.Objects;  // เพิ่ม import นี้
import com.java.ChatGPTFree.Prototype.round1.Code.Prototype_Chat_R1;

public class Product_Chat_R1 implements Prototype_Chat_R1 {
    private String name;
    private double price;

    public Product_Chat_R1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Override clone method to implement deep copy
    @Override
    public Product_Chat_R1 clone() {
        return new Product_Chat_R1(this.name, this.price);
    }

    // equals and hashCode for testing purposes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product_Chat_R1 product = (Product_Chat_R1) obj;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
