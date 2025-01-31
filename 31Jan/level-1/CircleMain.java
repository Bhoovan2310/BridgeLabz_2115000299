import java.util.*;

class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        circle c = new circle(radius);
        c.display();
        sc.close();
    }
}