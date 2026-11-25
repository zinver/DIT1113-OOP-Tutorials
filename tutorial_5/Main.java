public class Main {

    public static void main(String[] args) {

        Appliance washer = new WashingMachine("LG");
        Appliance fridge = new Refrigerator("Panasonic");
        Appliance aircon = new AirConditioner("Daikin");
        Appliance tv = new Television("Samsung");

        washer.displayBrand();
        washer.turnOn();
        washer.operate();
        washer.turnOff();

        System.out.println();

        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();

        System.out.println();

        aircon.displayBrand();
        aircon.turnOn();
        aircon.operate();
        aircon.turnOff();

        System.out.println();

        tv.displayBrand();
        tv.turnOn();
        tv.operate();
        tv.turnOff();
    }
}