package com.school;

public class Course implements Storable {
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course: " + name + " (ID: " + id + ")";
    }

    @Override
    public String toDataString() {
        // This is what FileStorageService will write to file
        return id + "," + name;
    }
}