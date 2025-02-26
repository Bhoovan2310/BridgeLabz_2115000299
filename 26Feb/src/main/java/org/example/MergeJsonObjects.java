package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ObjectNode json1 = mapper.createObjectNode();
            json1.put("name", "Alice");
            json1.put("age", 25);

            ObjectNode json2 = mapper.createObjectNode();
            json2.put("email", "alice@example.com");
            json2.put("city", "New York");

            json1.setAll(json2);
            System.out.println(json1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

