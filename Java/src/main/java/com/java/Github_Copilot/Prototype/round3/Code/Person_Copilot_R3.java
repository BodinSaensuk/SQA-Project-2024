package com.java.Github_Copilot.Prototype.round3.Code;

public class Person_Copilot_R3 implements Cloneable {
    private String name;
    private int age;

    public Person_Copilot_R3(String name, int age) {
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
    protected Object clone() throws CloneNotSupportedException {
        return new Person_Copilot_R3(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
