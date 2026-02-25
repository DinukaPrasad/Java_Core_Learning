package com.dino.javacore.lesson08;

// ============================================================
// Student Model — Simple Immutable POJO
// ============================================================
// Used in the List vs Map performance benchmark.
// ============================================================

public class Student {

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
