package com.school;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Students
        Student s1 = new Student("Alice", "10th Grade");
        Student s2 = new Student("Bob", "11th Grade");
        Student s3 = new Student("Charlie", "12th Grade");

        // Teachers
        Teacher t1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher t2 = new Teacher("Ms. Johnson", "Physics");

        // Staff
        Staff staff1 = new Staff("John Doe", "Clerk");

        // Print Students
        System.out.println("---- Students ----");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        // Print Teachers
        System.out.println("\n---- Teachers ----");
        t1.displayDetails();
        t2.displayDetails();

        // Print Staff
        System.out.println("\n---- Staff ----");
        staff1.displayDetails();

        // Attendance Records
        System.out.println("\n---- Attendance Records ----");
        LocalDate today = LocalDate.of(2025, 9, 4);
        AttendanceRecord a1 = new AttendanceRecord(s1.getId(), today, true);
        AttendanceRecord a2 = new AttendanceRecord(s2.getId(), today, false);
        AttendanceRecord a3 = new AttendanceRecord(s3.getId(), today, true);

        a1.displayRecord();
        a2.displayRecord();
        a3.displayRecord();
    }
}
