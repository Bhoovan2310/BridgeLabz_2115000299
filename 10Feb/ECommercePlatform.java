abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void calculateFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
        double finalPrice = product.getPrice() - discount + tax;
        System.out.println(product.getName() + " | Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Electronics electronics = new Electronics("E101", "Laptop", 50000);
        Clothing clothing = new Clothing("C202", "T-Shirt", 1000);
        Groceries groceries = new Groceries("G303", "Rice", 500);

        calculateFinalPrice(electronics);
        calculateFinalPrice(clothing);
        calculateFinalPrice(groceries);
    }
}
