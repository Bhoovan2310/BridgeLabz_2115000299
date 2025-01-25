import java.util.Scanner;

public class BmiMultidimensional_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i+1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i+1) + ": ");
            personData[i][1] = scanner.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("BMI Calculation with 2D Array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + ": Height = " + personData[i][1] + ", Weight = " + personData[i][0] + ", BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }
    }
}
