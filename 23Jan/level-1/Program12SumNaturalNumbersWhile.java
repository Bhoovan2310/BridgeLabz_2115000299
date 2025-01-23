import java.util.Scanner;

public class Program12SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            int sumWhile = 0;
            int i = 1;
            
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            
            int sumFormula = n * (n + 1) / 2;
            
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            
            if (sumWhile == sumFormula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is an error in the calculation.");
            }
        }
    }
}
