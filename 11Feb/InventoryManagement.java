class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head;

    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        if (position <= 0) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item newItem = new Item(itemName, itemId, quantity, price);
        Item temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }

    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public Item searchByItemId(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public Item searchByItemName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public double calculateTotalInventoryValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    private Item mergeSorted(Item left, Item right, boolean sortByPrice, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        Item result;
        if ((sortByPrice ? left.price < right.price : left.itemName.compareToIgnoreCase(right.itemName) < 0) == ascending) {
            result = left;
            result.next = mergeSorted(left.next, right, sortByPrice, ascending);
        } else {
            result = right;
            result.next = mergeSorted(left, right.next, sortByPrice, ascending);
        }
        return result;
    }

    private Item mergeSort(Item head, boolean sortByPrice, boolean ascending) {
        if (head == null || head.next == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Item mid = slow.next;
        slow.next = null;
        Item left = mergeSort(head, sortByPrice, ascending);
        Item right = mergeSort(mid, sortByPrice, ascending);
        return mergeSorted(left, right, sortByPrice, ascending);
    }

    public void sortInventory(boolean sortByPrice, boolean ascending) {
        head = mergeSort(head, sortByPrice, ascending);
    }

    public void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.itemName + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addAtEnd("Laptop", 101, 5, 50000);
        inventory.addAtBeginning("Mouse", 102, 10, 1500);
        inventory.addAtPosition("Keyboard", 103, 7, 2500, 1);
        
        System.out.println("All Items:");
        inventory.display();
        
        System.out.println("\nAfter Removing Item ID 102:");
        inventory.removeByItemId(102);
        inventory.display();

        System.out.println("\nUpdating Quantity of Item ID 101:");
        inventory.updateQuantity(101, 8);
        inventory.display();

        System.out.println("\nSearching for Item by ID 103:");
        Item foundItem = inventory.searchByItemId(103);
        if (foundItem != null) {
            System.out.println("Found -> ID: " + foundItem.itemId + ", Name: " + foundItem.itemName + ", Quantity: " + foundItem.quantity + ", Price: " + foundItem.price);
        }

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalInventoryValue());

        System.out.println("\nSorting by Price in Ascending Order:");
        inventory.sortInventory(true, true);
        inventory.display();

        System.out.println("\nSorting by Name in Descending Order:");
        inventory.sortInventory(false, false);
        inventory.display();
    }
}
