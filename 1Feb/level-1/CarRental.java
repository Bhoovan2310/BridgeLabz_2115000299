public class CarRental {
    private String customerName, carModel;
    private int rentalDays;
    private double dailyRate = 50.0;

    public CarRental() {
        this("Unknown", "Sedan", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public String getRental() {
        return customerName + " rented a " + carModel + " for " + rentalDays + " days. Total Cost: $" + (rentalDays * dailyRate);
    }

    public void setRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("David", "SUV", 4);
        System.out.println(rental.getRental());
        rental.setRental("Sophia", "Convertible", 7);
        System.out.println(rental.getRental());
    }
}
