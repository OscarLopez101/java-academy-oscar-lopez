package com.pluralsight;


import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter middle name(press enter if none): ");
        String middlename = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastname = scanner.nextLine();

        System.out.println("enter suffix (press enter if none): ");
        String suffix = scanner.nextLine();

        System.out.println("First name: " + firstName);
        if (!middlename.isEmpty()) {
            System.out.println("Middle name: " + middlename);
        }
        System.out.println("Last name: " + lastname);
        if (!suffix.isEmpty()) {
            System.out.println("Suffix: " + suffix);
        }


        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName).append(" ");
        if (!middlename.isEmpty()) {
            fullName.append(middlename).append(" ");
        }
        fullName.append(lastname);
        if (!suffix.isEmpty()) {
            fullName.append(" ").append(suffix);
        }

        System.out.println("\nFull name: " + fullName);

        scanner.close();





    }




}
