public class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = 1;
        student.name = "John Doe";
        student.setCGPA(3.9);
        System.out.println(student.name);
        System.out.println(student.getCGPA());
    }
}
