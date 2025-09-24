package com.school;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private List<AttendanceRecord> attendanceLog;
    private FileStorageService storageService;

    public AttendanceService(FileStorageService storageService) {
        this.storageService = storageService;
        this.attendanceLog = new ArrayList<>();
    }

    public void markAttendance(Student student, Course course, String status) {
        AttendanceRecord record = new AttendanceRecord(student, course, status);
        attendanceLog.add(record);
        System.out.println("Marked attendance: " + record);
    }

    public void markAttendance(int studentId, int courseId, String status, List<Student> allStudents, List<Course> allCourses) {
        Student student = findStudentById(studentId, allStudents);
        Course course = findCourseById(courseId, allCourses);
        if (student != null && course != null) {
            markAttendance(student, course, status);
        } else {
            System.out.println("❌ Could not mark attendance (student or course not found)");
        }
    }

    private Student findStudentById(int id, List<Student> allStudents) {
        for (Student s : allStudents) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    private Course findCourseById(int id, List<Course> allCourses) {
        for (Course c : allCourses) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public void displayAttendanceLog() {
        System.out.println("\n📒 Attendance Log:");
        for (AttendanceRecord record : attendanceLog) {
            System.out.println(record);
        }
    }

    public void displayAttendanceLog(Student student) {
        System.out.println("\n📒 Attendance Log for student: " + student.getName());
        for (AttendanceRecord record : attendanceLog) {
            if (record.getStudent().equals(student)) {
                System.out.println(record);
            }
        }
    }

    public void displayAttendanceLog(Course course) {
        System.out.println("\n📒 Attendance Log for course: " + course.getName());
        for (AttendanceRecord record : attendanceLog) {
            if (record.getCourse().equals(course)) {
                System.out.println(record);
            }
        }
    }

    public void saveAttendanceData() {
        storageService.saveData(attendanceLog, "attendance_log.txt");
        System.out.println("✅ Attendance data saved.");
    }
}