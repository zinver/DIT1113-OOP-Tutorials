public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tutorial 1: Java Basics ===");
        
        // 1. Variables
        String studentName = "Ahmed Fardin";
        int age = 20;
        boolean isEnrolled = true;
        
        System.out.println("Student: " + studentName + " | Age: " + age);
        
        // 2. If-Else Statement
        if (isEnrolled) {
            System.out.println("Status: Enrolled in DIT1113");
        } else {
            System.out.println("Status: Not Enrolled");
        }
        
        // 3. For Loop
        System.out.println("Looping 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }
    }
}