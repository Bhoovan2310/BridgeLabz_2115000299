class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;

    Patient(String name, int age, int patientID) {
        this.name = name;
        this.age = age;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println(name + " - Age: " + age + " - ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, 1001);
        p1.display();
        getTotalPatients();
    }
}
