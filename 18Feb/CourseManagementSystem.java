import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    @Override
    public void evaluate() {
        System.out.println("Evaluating with an exam.");
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public void evaluate() {
        System.out.println("Evaluating with assignments.");
    }
}

class ResearchCourse extends CourseType {
    @Override
    public void evaluate() {
        System.out.println("Evaluating with research papers.");
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        courseType.evaluate();
    }
}

class University {
    public static void displayCourses(List<? extends Course<? extends CourseType>> courses) {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();
        }
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> mathExamCourse = new Course<>("Math 101", new ExamCourse());
        Course<AssignmentCourse> csAssignmentCourse = new Course<>("CS 101", new AssignmentCourse());
        Course<ResearchCourse> physicsResearchCourse = new Course<>("Physics 101", new ResearchCourse());

        System.out.println("Displaying Course Details:");
        mathExamCourse.displayCourseDetails();
        csAssignmentCourse.displayCourseDetails();
        physicsResearchCourse.displayCourseDetails();
        
        System.out.println("\nEvaluating All Courses Dynamically:");
        List<Course<? extends CourseType>> courses = new ArrayList<>();
        courses.add(mathExamCourse);
        courses.add(csAssignmentCourse);
        courses.add(physicsResearchCourse);

        University.displayCourses(courses);
    }
}
