package com.dino.javacore.lesson16;

// ============================================================
// Student Model — Used by Stream API Examples
// ============================================================

public class Student {

    private final String name;
    private final int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + "}";
    }
}
