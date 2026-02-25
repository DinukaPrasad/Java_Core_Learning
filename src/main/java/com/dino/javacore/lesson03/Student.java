package com.dino.javacore.lesson03;

// ============================================================
// Student — Child class that extends Person
// ============================================================
// Inherits name and email from Person.
// Adds studentId and major fields.
// Overrides printProfile() to include extra info.
// ============================================================

public class Student extends Person {

    private String studentId;
    private String major;

    public Student(String name, String email, String studentId, String major) {
        super(name, email); // call the parent constructor
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void printProfile() {
        super.printProfile(); // reuse parent logic
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }
}
