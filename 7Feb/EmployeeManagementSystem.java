class Employee {
    String name;
    int id, salary;
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager() {
        super("Manager", 1, 100000);
        teamSize = 10;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programingLanguage;
    Developer() {
        super("Developer", 2, 80000);
        programingLanguage = "Java";
    }

    public void displayDetails () {
        super.displayDetails();
        System.out.println("Programming Language: " + programingLanguage);
    }
}

class Intern extends Employee {
    String project;
    Intern() {
        super("Intern", 3, 20000);
        project = "Some Project";
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Project: " + project);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.displayDetails();
        e = new Developer();
        e.displayDetails();
        e = new Intern();
        e.displayDetails();
    }
    
}