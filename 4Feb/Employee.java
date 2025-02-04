class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println(name + " - " + id + " - " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, "Developer");
        e1.display();
        displayTotalEmployees();
    }
}
