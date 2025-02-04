class Product {
    static double discount = 10.0;
    final int productID;
    String name;
    double price;

    Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println(name + " - $" + price + " (Discount: " + discount + "%)");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000);
        p1.display();
        updateDiscount(15.0);
    }
}
