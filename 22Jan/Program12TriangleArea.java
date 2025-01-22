import java.util.Scanner;
public class Program12TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / (2.54 * 2.54);
        System.out.println("The area of the triangle is " + areaCm2 + " square cm and " + areaInches2 + " square inches");
    }
}