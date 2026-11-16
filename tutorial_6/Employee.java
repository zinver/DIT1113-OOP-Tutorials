package tutorial_6;

public class Employee {
    // Protected means subclasses (like Lecturer) can also access these
    protected String id;
    protected String name;
    protected String department; // Added variable

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
    }
    
    public void displayDepartment() {
        System.out.println("Department : " + department);
    }
}