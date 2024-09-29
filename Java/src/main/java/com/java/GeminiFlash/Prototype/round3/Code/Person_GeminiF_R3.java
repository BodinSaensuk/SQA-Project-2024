package com.java.GeminiFlash.Prototype.round3.Code;

public class Person_GeminiF_R3 implements Cloneable {
    private String name;
    private int age;

    public Person_GeminiF_R3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person_GeminiF_R3 clone() {
        try {
            return (Person_GeminiF_R3) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }
}
