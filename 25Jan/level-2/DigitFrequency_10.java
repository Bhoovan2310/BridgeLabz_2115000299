import java.util.Scanner;

public class DigitFrequency_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = new int[10];
        int temp = number;

        while (temp != 0) {
            digits[temp % 10]++;
            temp /= 10;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + " appears " + digits[i] + " time(s).");
            }
        }
    }
}
