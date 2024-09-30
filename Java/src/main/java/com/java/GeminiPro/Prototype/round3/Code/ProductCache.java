package com.java.GeminiPro.Prototype.round3.Code;

import java.util.HashMap;

public class ProductCache {
    private static HashMap<String, Prototype> productMap = new HashMap<>();

    public static Prototype getProduct(String productId) {
        Prototype cachedProduct = productMap.get(productId);
        return cachedProduct != null ? cachedProduct.clone() : null; // Use clone
    }

    public static void loadCache() {
        ProductCache_GeminiP_R3 laptop = new ProductCache_GeminiP_R3("Laptop", 1200.0);
        productMap.put("1", laptop);

        ProductCache_GeminiP_R3 phone = new ProductCache_GeminiP_R3("Smartphone", 800.0);
        productMap.put("2", phone);
    }
}
