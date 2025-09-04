package com.school;

public class Staff extends Person {
    private String position;

    public Staff(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Role: Staff, Position: " + position);
    }
}
