
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    int grade;
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String role;
    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
public class SchoolSystemwithDifferentRoles {
    public static void main(String[] args) {
        Teacher t = new Teacher("John Doe", 35, "Math");
        t.displayRole();
        
        Student s = new Student("Jane Smith", 15, 10);
        s.displayRole();
        
        Staff st = new Staff("Alice Johnson", 25, "Librarian");
        st.displayRole();
    }
}
