abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getItemDetails() {
        return "Item: " + itemName + " | Price: " + price + " | Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (getQuantity() * 20);
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% discount on Non-Veg Items";
    }
}

public class FoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        double totalPrice = item.calculateTotalPrice();
        double discount = item instanceof Discountable ? ((Discountable) item).applyDiscount() : 0;
        double finalPrice = totalPrice - discount;
        System.out.println(item.getItemDetails() + " | Total Price: " + totalPrice + " | Discount: " + discount + " | Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        VegItem veg = new VegItem("Paneer Butter Masala", 250, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}
