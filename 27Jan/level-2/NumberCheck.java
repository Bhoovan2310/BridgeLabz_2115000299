import java.util.Scanner;

public class NumberCheck {

    public static String isPositive(int number) {
        if (number >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + (i + 1) + " (" + numbers[i] + ") is " + positivity);
            if (positivity.equals("Positive")) {
                String evenOrOdd = isEvenOrOdd(numbers[i]);
                System.out.println(" and is " + evenOrOdd);
            } else {
                System.out.println();
            }
        }

        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
