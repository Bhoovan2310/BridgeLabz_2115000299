import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    public abstract void displayJobRole();
}

class SoftwareEngineer extends JobRole {
    @Override
    public void displayJobRole() {
        System.out.println("Software Engineer: Responsible for designing and developing software applications.");
    }
}

class DataScientist extends JobRole {
    @Override
    public void displayJobRole() {
        System.out.println("Data Scientist: Focuses on analyzing and interpreting complex data.");
    }
}

class ProductManager extends JobRole {
    @Override
    public void displayJobRole() {
        System.out.println("Product Manager: Responsible for guiding the success of a product and leading the cross-functional team.");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void displayResumeDetails() {
        System.out.println("Candidate Name: " + candidateName);
        jobRole.displayJobRole();
    }
}

class ResumeScreening {
    public static void processResumes(List<Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.displayResumeDetails();
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>("Charlie", new ProductManager());

        System.out.println("Displaying Candidate Resumes:");
        softwareEngineerResume.displayResumeDetails();
        dataScientistResume.displayResumeDetails();
        productManagerResume.displayResumeDetails();

        System.out.println("\nProcessing Resumes in the Screening Pipeline:");
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(softwareEngineerResume);
        resumes.add(dataScientistResume);
        resumes.add(productManagerResume);

        ResumeScreening.processResumes(resumes);
    }
}
