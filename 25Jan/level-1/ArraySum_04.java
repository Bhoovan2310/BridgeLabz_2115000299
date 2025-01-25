import java.util.Scanner;

public class ArraySum_04 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();
            if (input <= 0 || i >= 10) break;
            numbers[i] = input;
        }

        for (double num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
