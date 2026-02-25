package Lesson03_Comparator_And_Sorting;

// ============================================================
// Student Model — Immutable POJO with toString()
// ============================================================
// Used by Comparator sorting examples.
// Fields are marked final — values are set once via the constructor.
// ============================================================

public class Student {
    private final int id;
    private final String name;
    private final int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', mark=" + mark + "}";
    }
}
