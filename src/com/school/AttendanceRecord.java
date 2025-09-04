package com.school;

import java.time.LocalDate;

public class AttendanceRecord {
    private int studentId;
    private LocalDate date;
    private boolean present;

    public AttendanceRecord(int studentId, LocalDate date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + studentId 
                           + ", Date: " + date 
                           + ", Present: " + present);
    }
}
