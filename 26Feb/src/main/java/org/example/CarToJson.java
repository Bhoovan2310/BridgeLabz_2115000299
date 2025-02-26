package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
    private String brand;
    private int year;
    private double price;

    public CarToJson() {}
    public CarToJson(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public static void main(String[] args) {
        try {
            CarToJson car = new CarToJson("Toyota", 2023, 30000.0);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}