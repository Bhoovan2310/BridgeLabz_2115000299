class Course {
    String courseName;
    double duration;

    Course(String courseName, double duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    Boolean isRecorded;

    OnlineCourse(String courseName, double duration, String platform, Boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;

    PaidOnlineCourse(String courseName, double duration, String platform, Boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}



public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java", 2.5, "Coursera", true, 100, 10);
        p.displayCourseDetails();
    }
}
