import java.util.Scanner;

public class Program17EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus for the employee: " + bonus);
        } else {
            System.out.println("No bonus for the employee.");
        }
    }
}
