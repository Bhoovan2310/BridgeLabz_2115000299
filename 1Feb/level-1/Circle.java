public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Radius: " + c.getRadius());
        c.setRadius(5.5);
        System.out.println("Updated Radius: " + c.getRadius());
    }
}
