class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println(ownerName + " - " + vehicleType + " - Reg: " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car", "MH12AB1234");
        v1.display();
        updateRegistrationFee(6000.0);
    }
}
