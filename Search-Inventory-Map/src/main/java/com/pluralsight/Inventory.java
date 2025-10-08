package com.pluralsight;

import java.io.*;
import java.net.URL;
import java.util.*;

public class Inventory {
    private Map<String, Product> products = new HashMap<>();

    // loadInventory() method that finds the file inside resources
    public void loadInventory(String fileName) {
        try {
            // Locate the file in src/main/resources (if using Maven/Gradle)
            // or in the classpath
            URL resource = Inventory.class.getClassLoader().getResource(fileName);

            if (resource == null) {
                System.out.println("File not found: " + fileName);
                return;
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    int quantity = Integer.parseInt(parts[2]);

                    Product product = new Product(name, price, quantity);
                    products.put(name, product);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void printInventory() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}

