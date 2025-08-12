package com.school;

public class Course {
    private static int nextCourseIdCounter = 101; 
    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: C" + courseId); 
    }
}