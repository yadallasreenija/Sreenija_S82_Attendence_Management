package com.school;

public class Person {
    private static int nextIdCounter = 1; // shared across all
    protected int id;
    protected String name;

    public Person(String name) {
        this.id = nextIdCounter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Default (can be overridden)
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
