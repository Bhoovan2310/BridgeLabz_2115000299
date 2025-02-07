class animal {
    String name;
    int age;
    animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends animal {
    Dog() {
        super("Dog", 5);
    }
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends animal {
    Cat() {
        super("Cat", 3);
    }
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends animal {
    Bird() {
        super("Bird", 2);
    }
    public void makeSound() {
        System.out.println("Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        animal a = new Dog();
        a.makeSound();
        a = new Cat();
        a.makeSound();
        a = new Bird();
        a.makeSound();
    }
}
