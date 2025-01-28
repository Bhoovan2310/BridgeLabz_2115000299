import java.util.Scanner;

public class TrigonometricFunctions_11 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an angle in degrees:");
        double angle = scanner.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + result[0] + ", Cos: " + result[1] + ", Tan: " + result[2]);
    }
}
