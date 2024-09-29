package com.java.Github_Copilot.Prototype.round2.Code;

// Vehicle.java
public class Vehicle_Copilot_R2 implements ProtoType_Copilot_R2 { // เปลี่ยนเป็น ProtoType_Copilot_R2
    private String make;
    private String model;
    private int year;

    public Vehicle_Copilot_R2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public Vehicle_Copilot_R2 clone() {
        return new Vehicle_Copilot_R2(this.make, this.model, this.year);
    }
}
