// Write a program to use Stream API along with lambda expressions and functional interfaces.

// Write the above program with For each loop using optional classes, static and default methods.
// Write a Java program to manage a list of students.
// Requirements:
// Create a Student class with id, name, and marks.
// Store at least 5 students in an ArrayList.
// Display all students using the for-each loop.
// Use Stream API to:
// Display students having marks greater than 75.
// Sort students by marks.
// Use a lambda expression wherever required.
// Create a functional interface StudentFilter.
// Use the Optional class to search for a student by ID.
// Add one default method and one static method in the functional interface and invoke them.
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface StudentFilter {

    boolean filter(Student s);

    default void displayMsg() {
        System.out.println("Default Method: Filtering students...");
    }

    static void welcome() {
        System.out.println("Static Method: Student Filter Started");
    }
}

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return this.marks;
    }
}

class Main {

    public static void main(String[] args) {
        ArrayList<Student> li = new ArrayList<>();
        li.add(new Student(1, "Ravi", 85));
        li.add(new Student(2, "Riya", 76));
        li.add(new Student(3, "Pranav", 45));
        li.add(new Student(4, "Shruti", 90));
        li.add(new Student(5, "Manu", 60));

        // Display all students
        li.forEach(student
                -> System.out.println(student.id + " " + student.name + " " + student.marks)
        );

// Functional interface
        StudentFilter sf = student -> student.marks > 75;

        StudentFilter.welcome();
        sf.displayMsg();

// Filter students
        li.stream()
                .filter(sf::filter)
                .forEach(student
                        -> System.out.println(student.name + " " + student.marks)
                );

// Sort students
        List<Student> sortedList = li.stream()
                .sorted(Comparator.comparingInt(Student::getMarks))
                .collect(Collectors.toList());

        sortedList.forEach(student
                -> System.out.println(student.name + " " + student.marks)
        );

// Optional
        Optional<Student> result = li.stream()
                .filter(student -> student.id == 4)
                .findFirst();

        result.ifPresent(student
                -> System.out.println("Found: " + student.name)
        );
    }
}
