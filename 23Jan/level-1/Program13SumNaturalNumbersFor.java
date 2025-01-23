import java.util.Scanner;

public class Program13SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            
            int sumFormula = n * (n + 1) / 2;
            
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            
            if (sumFor == sumFormula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is an error in the calculation.");
            }
        }
    }
}
