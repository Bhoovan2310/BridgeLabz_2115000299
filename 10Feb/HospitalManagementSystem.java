import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public String getPatientDetails() {
        return "ID: " + patientId + " | Name: " + name + " | Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, double roomCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return roomCharge * daysAdmitted + 5000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": " + records);
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}

public class HospitalManagementSystem {
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails() + " | Bill: " + patient.calculateBill());
        if (patient instanceof MedicalRecord) {
            ((MedicalRecord) patient).viewRecords();
        }
    }

    public static void main(String[] args) {
        InPatient inPatient = new InPatient("P101", "Alice", 45, 2000, 5);
        inPatient.addRecord("Blood Test: Normal");
        inPatient.addRecord("X-Ray: No Issues");

        OutPatient outPatient = new OutPatient("P202", "Bob", 30, 500);

        processPatient(inPatient);
        processPatient(outPatient);
    }
}
