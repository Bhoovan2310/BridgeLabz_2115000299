import java.util.Scanner;

public class SimpleInterestCalculator_1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal, Rate, and Time:");
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        System.out.println("The Simple Interest is " + calculateSimpleInterest(principal, rate, time));
    }
}
