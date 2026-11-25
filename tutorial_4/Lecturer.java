
public class Lecturer extends Employee {
    private String subject;

    // Constructor calling the parent (Employee) constructor using super()
    public Lecturer(String id, String name, String subject, String department) {
        super(id, name, department);
        this.subject = subject;
    }

    public void displaySubject() {
        System.out.println("Subject : " + subject);
    }
}