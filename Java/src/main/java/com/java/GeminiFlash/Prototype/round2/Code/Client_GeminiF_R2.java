package com.java.GeminiFlash.Prototype.round2.Code;

public class Client_GeminiF_R2 {
    public static void main(String[] args) {
        MyClass_GeminiF_R2 prototype = new MyClass_GeminiF_R2();
        // Set prototype attributes
        prototype.setAttribute("Some Value"); // สมมติว่ามีเมธอด setAttribute()

        try {
            // Create new instances using cloning
            MyClass_GeminiF_R2 instance1 = (MyClass_GeminiF_R2) prototype.clone();
            MyClass_GeminiF_R2 instance2 = (MyClass_GeminiF_R2) prototype.clone();

            // Modify instance attributes if needed
            instance1.setAttribute("New Value for Instance 1"); // เปลี่ยนค่า instance1
            // instance2 จะยังคงเป็นค่าเดิมจาก prototype

            // Print attributes to verify
            System.out.println("Prototype Attribute: " + prototype.getAttribute());
            System.out.println("Instance 1 Attribute: " + instance1.getAttribute());
            System.out.println("Instance 2 Attribute: " + instance2.getAttribute());
        } catch (RuntimeException e) {
            e.printStackTrace(); // จัดการกับข้อยกเว้น
        }
    }
}
