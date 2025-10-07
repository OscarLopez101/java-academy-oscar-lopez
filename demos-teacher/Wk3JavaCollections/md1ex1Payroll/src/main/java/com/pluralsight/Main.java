package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Prompt for input and output file names
        System.out.print("Enter the name of the employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        // Try-with-resources for both reader and writer
        try (
                BufferedReader bufReader = new BufferedReader(new FileReader(inputFileName));
                PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))
        ) {
            String line;

            // Write header line to the payroll file
            writer.println("id|name|gross pay");

            // Read each line from the employee file
            while ((line = bufReader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee emp = new Employee(employeeId, name, hoursWorked, payRate);

                // Write employee payroll info to output file
                writer.printf("%d|%s|%.2f%n",
                        emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
            }

            System.out.println("Payroll report written to: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}






