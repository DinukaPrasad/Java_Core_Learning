<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Core_Java-Bootcamp-blue?style=for-the-badge" alt="Bootcamp"/>
  <img src="https://img.shields.io/badge/Lessons-21-green?style=for-the-badge" alt="21 Lessons"/>
  <img src="https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge" alt="Status"/>
</p>

<h1 align="center">☕ Java Core Bootcamp — My Learning Roadmap</h1>

<p align="center">
  <b>A structured, 21-lesson roadmap through core Java — from OOP fundamentals to JVM internals.</b>
  <br/>
  <i>I built this for myself to learn Java properly. Now I'm sharing it so you can follow the same path.</i>
</p>

---

## 👤 About Me

Hi, I'm **Dino** 👋

I'm a Software Engineering student at **Cardiff Metropolitan University**, building a strong foundation in backend development and cloud engineering. I created this bootcamp as my personal learning roadmap — and now I'm sharing it here so others can benefit from the same structured approach.

| | |
|---|---|
| 🎓 **University** | Cardiff Metropolitan University |
| 📚 **Course** | BSc (Hons) Software Engineering |

---

## 📖 Why This Exists

I didn't want to just watch tutorials and move on. I wanted to **actually understand Java** — so I built this repo as my own hands-on learning roadmap.

Every lesson is something I wrote, ran, broke, and fixed myself. The goal was never to memorize syntax — it was to build real **engineering intuition** around how Java works under the hood.

I'm sharing this publicly because:
- 📌 It can serve as a **structured roadmap** if you're learning Java from scratch
- 📌 Every lesson has **runnable code** — clone it, run it, learn by doing
- 📌 The topics are ordered so each one **builds on the last**

> If you're starting your Java journey or want a clean reference, feel free to fork this and make it your own.

---

## 🗺️ The Roadmap — 6 Modules, 21 Lessons

Follow the lessons in order for the best learning experience. Each lesson includes a guide, runnable examples, and practice tasks.

### Module 1: Object-Oriented Programming

| # | Lesson | Guide |
|---|--------|-------|
| 01 | Classes & Objects | [lesson-01-classes-and-objects](src/main/java/com/dino/javacore/lesson01/lesson-01-classes-and-objects.md) |
| 02 | Encapsulation | [lesson-02-encapsulation](src/main/java/com/dino/javacore/lesson02/lesson-02-encapsulation.md) |
| 03 | Inheritance | [lesson-03-inheritance](src/main/java/com/dino/javacore/lesson03/lesson-03-inheritance.md) |
| 04 | Polymorphism + Abstraction | [lesson-04-polymorphism-and-abstraction](src/main/java/com/dino/javacore/lesson04/lesson-04-polymorphism-and-abstraction.md) |

### Module 2: Collections & Data Structures

| # | Lesson | Guide |
|---|--------|-------|
| 05 | List, Set, Map | [lesson-05-list-set-map](src/main/java/com/dino/javacore/lesson05/lesson-05-list-set-map.md) |
| 06 | Iteration + Generics | [lesson-06-iteration-and-generics](src/main/java/com/dino/javacore/lesson06/lesson-06-iteration-and-generics.md) |
| 07 | Sorting (Comparable/Comparator) | [lesson-07-sorting](src/main/java/com/dino/javacore/lesson07/lesson-07-sorting.md) |
| 08 | Performance Intuition | [lesson-08-performance-intuition](src/main/java/com/dino/javacore/lesson08/lesson-08-performance-intuition.md) |

### Module 3: Exception Handling

| # | Lesson | Guide |
|---|--------|-------|
| 09 | try / catch / finally | [lesson-09-try-catch-finally](src/main/java/com/dino/javacore/lesson09/lesson-09-try-catch-finally.md) |
| 10 | throw + Custom Exceptions | [lesson-10-throw-and-custom-exceptions](src/main/java/com/dino/javacore/lesson10/lesson-10-throw-and-custom-exceptions.md) |
| 11 | Exception Best Practices | [lesson-11-exception-best-practices](src/main/java/com/dino/javacore/lesson11/lesson-11-exception-best-practices.md) |

### Module 4: Multithreading & Concurrency

| # | Lesson | Guide |
|---|--------|-------|
| 12 | Threads & Runnable | [lesson-12-threads-and-runnable](src/main/java/com/dino/javacore/lesson12/lesson-12-threads-and-runnable.md) |
| 13 | Synchronization / Race Conditions | [lesson-13-synchronization](src/main/java/com/dino/javacore/lesson13/lesson-13-synchronization.md) |
| 14 | ExecutorService / Futures | [lesson-14-executor-service-and-futures](src/main/java/com/dino/javacore/lesson14/lesson-14-executor-service-and-futures.md) |

### Module 5: Lambdas & Streams

| # | Lesson | Guide |
|---|--------|-------|
| 15 | Lambda Expressions | [lesson-15-lambda-expressions](src/main/java/com/dino/javacore/lesson15/lesson-15-lambda-expressions.md) |
| 16 | Stream Pipeline Ops | [lesson-16-stream-pipeline](src/main/java/com/dino/javacore/lesson16/lesson-16-stream-pipeline.md) |
| 17 | reduce + Grouping Collectors | [lesson-17-reduce-and-collectors](src/main/java/com/dino/javacore/lesson17/lesson-17-reduce-and-collectors.md) |
| 18 | Stream Pitfalls | [lesson-18-stream-pitfalls](src/main/java/com/dino/javacore/lesson18/lesson-18-stream-pitfalls.md) |

### Module 6: JVM Internals

| # | Lesson | Guide |
|---|--------|-------|
| 19 | Stack vs Heap | [lesson-19-stack-vs-heap](src/main/java/com/dino/javacore/lesson19/lesson-19-stack-vs-heap.md) |
| 20 | GC Basics | [lesson-20-gc-basics](src/main/java/com/dino/javacore/lesson20/lesson-20-gc-basics.md) |
| 21 | Memory Leaks | [lesson-21-memory-leaks](src/main/java/com/dino/javacore/lesson21/lesson-21-memory-leaks.md) |

---

## 🚀 How to Use This Repo

### Prerequisites
- **Java 17+** (tested with JDK 23)
- **Maven 3.8+** (optional — `javac`/`java` works too)

### Option A: Maven
```bash
# Compile all lessons
mvn compile

# Run a specific lesson (e.g., Lesson 01)
mvn exec:java -Dexec.mainClass="com.dino.javacore.lesson01.Main"

# Run Lesson 16
mvn exec:java -Dexec.mainClass="com.dino.javacore.lesson16.Main"
```

### Option B: javac / java
```bash
# Compile all source files
javac -d out src/main/java/com/dino/javacore/**/*.java

# Run a specific lesson
java -cp out com.dino.javacore.lesson01.Main
java -cp out com.dino.javacore.lesson12.Main
```

### Option C: IDE (IntelliJ / VS Code)
Open the project, navigate to any `Main.java`, and click **Run**.

> **Tip:** Go through the lessons in order. Each one builds on concepts from the previous.

---

## 📁 Project Structure

```
java-core-bootcamp/
├── pom.xml                          # Maven build config
├── .gitignore                       # Ignores .class, IDE files, target/
├── README.md                        # You are here
│
├── docs/
│   ├── lesson-index.md              # Full lesson index with descriptions
│   └── progress-checklist.md        # Checkbox tracker for all 21 lessons
│
├── extras/                          # Original/alternate files from practice
│   └── (preserved alternate implementations)
│
└── src/main/java/com/dino/javacore/
    ├── lesson01/                    # Classes & Objects
    │   ├── Main.java               # Runnable example
    │   ├── Car.java                # Supporting class
    │   └── lesson-01-...md         # Lesson guide
    ├── lesson02/                    # Encapsulation
    │   ├── Main.java
    │   ├── Student.java
    │   └── lesson-02-...md
    ├── ...                          # Lessons 03–20
    └── lesson21/                    # Memory Leaks
        ├── Main.java
        └── lesson-21-...md
```

Each lesson folder is self-contained — code + guide in one place.

---

## 📚 What You'll Learn

| Module | Key Takeaways |
|--------|---------------|
| **OOP** | Classes are blueprints; encapsulation protects data; inheritance reduces duplication; polymorphism enables flexible design |
| **Collections** | Choose List/Set/Map based on access pattern; Comparator chains for complex sorting; HashMap is O(1) vs ArrayList O(n) |
| **Exceptions** | try/catch/finally for safety; custom exceptions for domain clarity; try-with-resources for cleanup |
| **Multithreading** | Threads run concurrently; synchronized/AtomicInteger prevent race conditions; ExecutorService manages thread pools |
| **Lambdas & Streams** | Lambdas replace verbose anonymous classes; Streams provide declarative data pipelines; Collectors aggregate results |
| **JVM** | Stack = method frames + primitives; Heap = objects; GC reclaims unreachable objects; memory leaks = reachable but useless objects |

---

## 💭 My Reflection

When I started learning Java, it felt strict and heavy compared to other languages. But as I went deeper — especially into OOP, multithreading, and JVM internals — I realized something:

> **Java doesn't just teach syntax. It teaches how systems actually work.**

Understanding how threads compete for shared memory, why race conditions happen, how the heap and stack behave, and why garbage collection pauses matter — completely changed how I think about backend systems.

This bootcamp wasn't about memorizing methods — it was about building **engineering intuition**. Now when I look at a Spring Boot API, a Dockerized microservice, or a high-concurrency backend — I don't just see code. I see memory, threads, and the architecture decisions behind it.

---

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Build:** Maven
- **IDE:** IntelliJ IDEA / VS Code with Java Extension Pack

---

## 📝 License

This project is for educational purposes. Feel free to fork, learn, and share!
