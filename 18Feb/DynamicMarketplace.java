class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + name + " | Price: $" + price + " | Category: " + category.getClass().getSimpleName());
    }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

public class DynamicMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book1 = new Product<>("Java Programming", 30.00, new BookCategory());
        Product<ClothingCategory> shirt1 = new Product<>("T-Shirt", 20.00, new ClothingCategory());
        Product<GadgetCategory> phone1 = new Product<>("Smartphone", 500.00, new GadgetCategory());

        System.out.println("Before Discount:");
        book1.displayProductDetails();
        shirt1.displayProductDetails();
        phone1.displayProductDetails();

        Marketplace.applyDiscount(book1, 10);
        Marketplace.applyDiscount(shirt1, 15);
        Marketplace.applyDiscount(phone1, 5);

        System.out.println("\nAfter Discount:");
        book1.displayProductDetails();
        shirt1.displayProductDetails();
        phone1.displayProductDetails();
    }
}
