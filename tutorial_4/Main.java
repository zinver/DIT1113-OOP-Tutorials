
public class Main {
    public static void main(String[] args) {
        // Create the Lecturer object with all the required data
        Lecturer lecturer = new Lecturer(
            "L100", 
            "Dr Ahmad", 
            "Java Programming", 
            "Faculty of Information Technology"
        );

        // Print in the exact order of the EXPECTED OUTPUT
        lecturer.displayInfo();
        lecturer.displaySubject();
        lecturer.displayDepartment();
    }
}