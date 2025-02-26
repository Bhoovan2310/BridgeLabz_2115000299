package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class FilterJsonRecords {
    public static void main(String[] args) {
        try {
            String jsonData = "[{\"name\":\"Alice\",\"age\":22},{\"name\":\"Bob\",\"age\":28},{\"name\":\"Charlie\",\"age\":30}]";

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonArray = objectMapper.readTree(jsonData);

            List<JsonNode> filteredRecords = new ArrayList<>();
            for (JsonNode node : jsonArray) {
                if (node.get("age").asInt() > 25) {
                    filteredRecords.add(node);
                }
            }

            String resultJson = objectMapper.writeValueAsString(filteredRecords);
            System.out.println(resultJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

