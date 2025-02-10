abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Base Salary: " + baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

class FullTimeEmployee extends Employee {
    private double workHours;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * 100);
    }
}

class PartTimeEmployee extends Employee {
    private double fixedSalary;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }
}

interface Department {
    void assignDepartment(String department);
    void getDepartmentDetails();
}

class EmployeeManagement implements Department {
    private String department;

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}


public class EmplopyeeManagementSystem {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(1, "John", 50000, 40);
        Employee partTimeEmployee = new PartTimeEmployee(2, "Jane", 30000, 2000);

        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.assignDepartment("HR");

        Employee[] employees = {fullTimeEmployee, partTimeEmployee};
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Employee Salary: " + employee.calculateSalary());
            employeeManagement.getDepartmentDetails();
            System.out.println();
        }
    }
}