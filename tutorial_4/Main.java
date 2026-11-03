package tutorial_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tutorial 4: Polymorphism ===");
        
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Parent reference, Child object
        
        myAnimal.makeSound(); // Output: Generic animal sound
        myDog.makeSound();    // Output: Woof! Woof! (Polymorphism in action)
    }
}