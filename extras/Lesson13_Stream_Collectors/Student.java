package Lesson13_Stream_Collectors;

// ============================================================
// Student Model — With Programme Field for Grouping
// ============================================================
// Used by the Collectors examples for groupingBy operations.
// ============================================================

class Student {
    String name;
    int mark;
    String programme;

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
