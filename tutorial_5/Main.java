package tutorial_5;

public class Main {
    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student();

        // Use setters to assign values
        student1.setStudentID("202502010015");
        student1.setName("Ahmed Fardin");
        student1.setCGPA(3.85);
        student1.setProgramme("Diploma in IT");

        // Use getters to print the values
        System.out.println("=== Student Information System ===");
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Name: " + student1.getName());
        System.out.println("CGPA: " + student1.getCGPA());
        System.out.println("Programme: " + student1.getProgramme());
    }
}