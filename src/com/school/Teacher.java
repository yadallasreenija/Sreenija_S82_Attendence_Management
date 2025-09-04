package com.school;

public class Teacher extends Person {
    private String subjectTaught;

    public Teacher(String name, String subjectTaught) {
        super(name);
        this.subjectTaught = subjectTaught;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Role: Teacher, Subject: " + subjectTaught);
    }
}
