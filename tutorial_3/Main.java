package tutorial_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tutorial 3: UML & OOP Design ===");
        
        Rectangle rect = new Rectangle();
        rect.width = 5.0;
        rect.height = 10.0;
        
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.calculateArea());
    }
}