package tutorial_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tutorial 4: Polymorphism ===");

        // Parent class object
        Animal myAnimal = new Animal();
        
        // Polymorphism: Parent reference, Child object!
        Animal myDog = new Dog(); 

        // Calling the methods
        myAnimal.makeSound();
        myDog.makeSound(); // Java knows to use the Dog's version at runtime!
    }
}