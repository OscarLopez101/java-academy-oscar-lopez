package com.pluralsight;

import java.util.Scanner;

public class M1ex2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter your name (first last OR first middle last): ");
            String input = scanner.nextLine().trim();

            String[] parts = input.split("\\s+");

            if (parts.length == 2) {

                String firstName = parts[0];
                String lastName = parts[1];

                System.out.println("\nFirst name: " + firstName);
                System.out.println("Last name: " + lastName);

            } else if (parts.length == 3) {
                // Format: first middle last
                String firstName = parts[0];
                String middleName = parts[1];
                String lastName = parts[2];

                System.out.println("\nFirst name: " + firstName);
                System.out.println("Middle name: " + middleName);
                System.out.println("Last name: " + lastName);

            } else {
                // Invalid input
                System.out.println("\nInvalid format. Please enter either:");
                System.out.println(" - first last");
                System.out.println(" - first middle last");
            }

            scanner.close();

}}
