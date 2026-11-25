// Abstract parent class: hides implementation details and gives
// every appliance the same common interface.
abstract class Appliance {

    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    // Every appliance works differently, so each subclass must implement this
    public abstract void operate();
}

class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

class Refrigerator extends Appliance {

    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Store food & beverages...");
    }
}

// Additional appliance 1
class AirConditioner extends Appliance {

    public AirConditioner(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooling the room...");
    }
}

// Additional appliance 2
class Television extends Appliance {

    public Television(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Showing TV channels...");
    }
}