package com.pluralsight;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {

        // Load the CSV file from resources
        URL resource = Main.class.getClassLoader().getResource("employees.csv");

        if (resource == null) {
            System.out.println("File not found!");
            return;
        }

        File file = new File(resource.getFile());

        try (BufferedReader bufReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufReader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee emp = new Employee(employeeId, name, hoursWorked, payRate);

                System.out.printf("ID: %d | Name: %-20s | Gross Pay: $%.2f%n",
                        emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
            }

        }
    }
}

