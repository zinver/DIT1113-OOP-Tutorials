package tutorial_2;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tutorial 2: Classes & Objects ===");
        
        Car mycar = new Car();
        mycar.brand = "Toyota";
        mycar.color = "Grey";
        mycar.speed = 100;

        System.out.println("Car color is: " + mycar.color);
        mycar.displayInfo();
    }
}