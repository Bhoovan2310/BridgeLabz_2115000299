import java.util.Scanner;

public class PositiveNegativeZeroCheck_02 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("Zero.");
            }
        }

        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First number is greater than the last number.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First number is equal to the last number.");
        }
    }
}
