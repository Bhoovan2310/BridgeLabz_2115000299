import java.util.Scanner;

public class StudentGrades2D_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Physics, Chemistry, and Maths for student " + (i+1) + ": ");
            marks[i][0] = scanner.nextDouble();
            marks[i][1] = scanner.nextDouble();
            marks[i][2] = scanner.nextDouble();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) {
                grades[i] = "A";
            } else if (percentage[i] >= 70) {
                grades[i] = "B";
            } else if (percentage[i] >= 60) {
                grades[i] = "C";
            } else if (percentage[i] >= 50) {
                grades[i] = "D";
            } else if (percentage[i] >= 40) {
                grades[i] = "I";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("Student Grades with 2D Array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ": Marks = " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] + ", Percentage = " + percentage[i] + "%, Grade = " + grades[i]);
        }
    }
}
