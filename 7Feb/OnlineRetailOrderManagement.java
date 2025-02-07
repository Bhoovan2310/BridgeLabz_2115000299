class Order {
    int OrderId;
    String OrderDate;
    
    Order() {
        OrderId = 1001;
        OrderDate = "10-10-2021";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    
    ShippedOrder() {
        super();
        trackingNumber = "123456";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    
    DeliveredOrder() {
        super();
        deliveryDate = "12-10-2021";
    }
    
    public void getOrderStatus() {
        System.out.println("Order ID: " + OrderId);
        System.out.println("Order Date: " + OrderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}


public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.getOrderStatus();
    }
}
