package tutorial_2;

public class Student {
    String name;
    String id;

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}