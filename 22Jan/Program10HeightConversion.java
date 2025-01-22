import java.util.Scanner;
public class Program10HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        double heightInch = heightCm / 2.54;
        int heightFeet = (int) (heightInch / 12);
        double remainingInches = heightInch % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + remainingInches);
    }
}