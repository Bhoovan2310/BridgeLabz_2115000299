abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails() {
        return "Car Insurance: Standard Coverage";
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance: Heavy Vehicle Coverage";
    }
}

public class VehicleRentalSystem {
    public static void calculateTotalCost(Vehicle vehicle, int days) {
        double rentalCost = vehicle.calculateRentalCost(days);
        double insuranceCost = vehicle instanceof Insurable ? ((Insurable) vehicle).calculateInsurance() : 0;
        System.out.println(vehicle.getType() + " | Rental Cost: " + rentalCost + " | Insurance Cost: " + insuranceCost);
    }

    public static void main(String[] args) {
        Car car = new Car("C123", 1000, "POL123");
        Bike bike = new Bike("B456", 500);
        Truck truck = new Truck("T789", 3000, "POL789");

        calculateTotalCost(car, 5);
        calculateTotalCost(bike, 3);
        calculateTotalCost(truck, 7);
    }
}
