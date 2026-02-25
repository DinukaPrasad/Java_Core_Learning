package com.dino.javacore.lesson17;

// ============================================================
// Student Model — With Programme Field for Grouping
// ============================================================

public class Student {

    private final String name;
    private final int mark;
    private final String programme;

    public Student(String name, int mark, String programme) {
        this.name = name;
        this.mark = mark;
        this.programme = programme;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getProgramme() {
        return programme;
    }

    @Override
    public String toString() {
        return name + " (" + mark + ")";
    }
}
