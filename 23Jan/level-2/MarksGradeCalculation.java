import java.util.Scanner;

public class MarksGradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter Math marks: ");
        double math = scanner.nextDouble();
        double totalMarks = physics + chemistry + math;
        double percentage = (totalMarks / 300) * 100;
        String grade;
        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "R";
        }
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
