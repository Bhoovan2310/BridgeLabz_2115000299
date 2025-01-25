import java.util.Scanner;

public class OddEvenSeparation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        System.out.print("\nEven numbers: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }
}
