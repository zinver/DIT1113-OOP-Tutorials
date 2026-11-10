package tutorial_3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali", "P001");
        Student s1 = new Student("Ahmed Fardin", "202502010015");
        Lecturer l1 = new Lecturer("Sir Nazmirul", "L001");

        // Expected Output from the PDF
        p1.introduce();
        s1.introduce();
        l1.introduce();
    }
}