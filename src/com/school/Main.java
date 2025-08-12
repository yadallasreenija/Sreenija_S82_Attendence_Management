package com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Course[] courses = new Course[3];

        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");

        courses[0] = new Course("Mathematics");
        courses[1] = new Course("Physics");
        courses[2] = new Course("Computer Science");

        System.out.println("---- Students ----");
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }

        System.out.println("---- Courses ----");
        for (Course c : courses) {
            c.displayInfo();
            System.out.println();
        }
    }
}