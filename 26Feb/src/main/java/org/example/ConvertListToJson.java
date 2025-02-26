package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class ConvertListToJson {
    public static void main(String[] args) {
        try {
            List<Student> students = Arrays.asList(
                    new Student("Alice", 22),
                    new Student("Bob", 24),
                    new Student("Charlie", 21)
            );

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(students);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
