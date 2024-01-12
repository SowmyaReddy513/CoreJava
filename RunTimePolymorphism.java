// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

// Child class
class Car extends Vehicle {
    // Override the start method
    @Override
    void start() {
        System.out.println("Car starting...");
    }
}

// Main class
public class RunTimePolymorphism {
    public static void main(String[] args) {
        // Create objects of parent and child classes
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();

        // Demonstrate runtime polymorphism
        vehicle.start(); // Output: Vehicle starting...
        car.start();     // Output: Car starting...
    }
}
