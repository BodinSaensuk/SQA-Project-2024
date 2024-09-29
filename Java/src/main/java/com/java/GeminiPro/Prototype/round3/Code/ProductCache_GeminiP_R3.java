package com.java.GeminiPro.Prototype.round3.Code;

import java.util.HashMap;

// Abstract Prototype (Interface)
interface Prototype extends Cloneable {
    Prototype clone();
    void display();
}

// Concrete Prototype (Product)
class ProductCache_GeminiP_R3 implements Prototype {
    private String name;
    private double price;

    public ProductCache_GeminiP_R3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone(); // แคสต์ให้ถูกต้อง
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported.", e);
        }
    }

    @Override
    public void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Prototype Manager (ProductCache)
class ProductCache {
    private static HashMap<String, Prototype> productMap = new HashMap<>();

    public static Prototype getProduct(String productId) {
        Prototype cachedProduct = productMap.get(productId);
        return cachedProduct.clone(); // เรียกใช้ clone
    }

    public static void loadCache() {
        ProductCache_GeminiP_R3 laptop = new ProductCache_GeminiP_R3("Laptop", 1200.0);
        productMap.put("1", laptop);

        ProductCache_GeminiP_R3 phone = new ProductCache_GeminiP_R3("Smartphone", 800.0);
        productMap.put("2", phone);
    }
}
