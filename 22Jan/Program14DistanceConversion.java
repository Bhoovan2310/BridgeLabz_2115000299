import java.util.Scanner;
public class Program14DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles");
    }
}