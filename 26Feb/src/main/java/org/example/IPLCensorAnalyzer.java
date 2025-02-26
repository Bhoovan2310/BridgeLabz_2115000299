package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class IPLCensorAnalyzer {
    public static void main(String[] args) {
        processJsonFile("ipl_data.json", "ipl_censored.json");
        processCsvFile("ipl_data.csv", "ipl_censored.csv");
    }

    private static void processJsonFile(String inputFile, String outputFile) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(inputFile));

            for (JsonNode node : rootNode) {
                ((ObjectNode) node).put("team1", maskTeamName(node.get("team1").asText()));
                ((ObjectNode) node).put("team2", maskTeamName(node.get("team2").asText()));
                ((ObjectNode) node).put("winner", maskTeamName(node.get("winner").asText()));
                ((ObjectNode) node).put("player_of_match", "REDACTED");
            }

            objectMapper.writeValue(new File(outputFile), rootNode);
            System.out.println("Censored JSON file created: " + outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processCsvFile(String inputFile, String outputFile) {
        try (Reader reader = new FileReader(inputFile);
             CSVReader csvReader = new CSVReader(reader);
             Writer writer = new FileWriter(outputFile);
             CSVWriter csvWriter = new CSVWriter(writer)) {

            List<String[]> data = csvReader.readAll();
            if (!data.isEmpty()) {
                csvWriter.writeNext(data.get(0));
                for (int i = 1; i < data.size(); i++) {
                    String[] row = data.get(i);
                    row[1] = maskTeamName(row[1]);
                    row[2] = maskTeamName(row[2]);
                    row[5] = maskTeamName(row[5]);
                    row[6] = "REDACTED";
                    csvWriter.writeNext(row);
                }
            }
            System.out.println("Censored CSV file created: " + outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String maskTeamName(String team) {
        String[] words = team.split(" ");
        if (words.length > 1) words[1] = "***";
        return String.join(" ", words);
    }
}
