class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }   
}

class Car extends Vehicle {
    int seatCapacity;
    Car() {
        super(200, "Petrol");
        seatCapacity = 5;
       
    }
    public void displayDetails() {
        displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    Truck() {
        super(100, "Diesel");
        loadCapacity = 1000;
    }
    public void displayDetails() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class MotorCycle extends Vehicle {
    int mileage;
    MotorCycle() {
        super(150, "Petrol");
        mileage = 50;
    }
    public void displayDetails() {
        displayInfo();
        System.out.println("Mileage: " + mileage);
    }
}

public class VehicleandTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Truck();
        vehicles[2] = new MotorCycle();
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }

    }
}
