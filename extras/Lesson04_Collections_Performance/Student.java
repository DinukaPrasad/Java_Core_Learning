package Lesson04_Collections_Performance;

// ============================================================
// Student Model — Simple Immutable POJO
// ============================================================
// Used in the List vs Map performance benchmark.
// ============================================================

class Student {
    private final int id;
    private final String name;

    Student(int id, String name) {
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
