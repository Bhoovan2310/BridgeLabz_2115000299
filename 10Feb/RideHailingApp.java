abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + " | Driver: " + driverName + " | Rate/km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

public class RideHailingApp {
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails() + " | Fare: " + vehicle.calculateFare(distance));
        if (vehicle instanceof GPS) {
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
        }
    }

    public static void main(String[] args) {
        Car car = new Car("C101", "John", 12.5, "Downtown");
        Bike bike = new Bike("B202", "Mike", 5.0);
        Auto auto = new Auto("A303", "David", 8.0, "City Center");

        processRide(car, 10);
        processRide(bike, 5);
        processRide(auto, 8);
    }
}
