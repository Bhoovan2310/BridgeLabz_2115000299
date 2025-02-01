public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeID = 1;
        employee.department = "Sales";
        employee.setSalary(5000);
        System.out.println(employee.department);
        System.out.println(employee.getSalary());
    }
}
