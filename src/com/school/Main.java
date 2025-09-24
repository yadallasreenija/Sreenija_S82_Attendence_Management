package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n🎓 School Directory:");
        for (Person person : people) {
            person.displayDetails(); // Polymorphic call
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student(1, "Alice", 10);
        Student s2 = new Student(2, "Bob", 11);

        // Create Teachers
        Teacher t1 = new Teacher("Mr. Smith", "Math");
        Teacher t2 = new Teacher("Ms. Johnson", "Science");

        // Create Staff
        Staff staff1 = new Staff("Mrs. Green", "Administration");

        // School People List
        ArrayList<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(t2);
        schoolPeople.add(staff1);

        // Display School Directory
        displaySchoolDirectory(schoolPeople);

        // Create Courses
        Course c1 = new Course(101, "Mathematics");
        Course c2 = new Course(102, "Science");

        // Prepare Students & Courses lists
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);

        List<Course> allCourses = new ArrayList<>();
        allCourses.add(c1);
        allCourses.add(c2);

        // Create FileStorageService & AttendanceService
        FileStorageService storageService = new FileStorageService();
        AttendanceService attendanceService = new AttendanceService(storageService);

        // Mark attendance using both overloaded methods
        attendanceService.markAttendance(s1, c1, "Present"); // Direct object version
        attendanceService.markAttendance(2, 102, "Absent", allStudents, allCourses); // Lookup version

        // Display all attendance logs
        attendanceService.displayAttendanceLog();
        attendanceService.displayAttendanceLog(s1);
        attendanceService.displayAttendanceLog(c2);

        // Save data to files
        storageService.saveData(allStudents, "students.txt");
        storageService.saveData(allCourses, "courses.txt");
        attendanceService.saveAttendanceData();
    }
}