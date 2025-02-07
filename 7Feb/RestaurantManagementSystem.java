
class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef c = new Chef("Alice", 101);
        c.performDuties();

        Waiter w = new Waiter("Bob", 102);
        w.performDuties();
    }
}
