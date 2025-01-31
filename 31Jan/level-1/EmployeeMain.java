import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = sc.nextLine();
        System.out.println("Enter the ID of the employee: ");
        int id = sc.nextInt();
        System.out.println("Enter the salary of the employee: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(name, id, salary);
        emp.display();
        sc.close();
    }
}