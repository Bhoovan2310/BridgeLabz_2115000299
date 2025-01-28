import java.util.Scanner;

public class CollinearPoints2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point A (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for Point B (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter coordinates for Point C (x3, y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the Slope formula.");
        } else {
            System.out.println("The points are NOT collinear using the Slope formula.");
        }

        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the Area of Triangle formula.");
        } else {
            System.out.println("The points are NOT collinear using the Area of Triangle formula.");
        }

        scanner.close();
    }

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        
        return slopeAB == slopeBC;
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        return area == 0;
    }
}
