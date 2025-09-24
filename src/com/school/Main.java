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

        // Create Attendance Records
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(s1, c1, "Present"));
        records.add(new AttendanceRecord(s2, c2, "Absent"));

        // Display Attendance Records
        System.out.println("\n📋 Attendance Log:");
        for (AttendanceRecord record : records) {
            record.displayRecord();
        }

        // Filter students from schoolPeople to save
        List<Student> studentsToSave = new ArrayList<>();
        for (Person person : schoolPeople) {
            if (person instanceof Student) {
                studentsToSave.add((Student) person);
            }
        }

        // Create FileStorageService
        FileStorageService storageService = new FileStorageService();
        storageService.saveData(studentsToSave, "students.txt");

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        storageService.saveData(courses, "courses.txt");

        storageService.saveData(records, "attendance_log.txt");
    }
}