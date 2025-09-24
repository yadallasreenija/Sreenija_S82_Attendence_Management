package com.school;

public class Student extends Person implements Storable {
    private int grade;

    public Student(int id, String name, int grade) {
        super(name);
        this.id = id; // manually set for demo
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student, Grade: " + grade);
    }

    @Override
    public String toDataString() {
        return id + "," + name + "," + grade;
    }
}