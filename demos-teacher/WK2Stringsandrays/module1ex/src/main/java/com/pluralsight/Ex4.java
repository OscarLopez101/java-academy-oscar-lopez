package com.pluralsight;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        String[] dateParts = date.split("/"); // ["MM", "dd", "yyyy"]
        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2];

        String formattedDate = year + "-" + month + "-" + day;

        System.out.println("How many tickets would you like?: ");
        int tickets = scanner.nextInt();

        String ticketWord = (tickets == 1) ? "ticket" : "tickets";

        System.out.println("\n" + tickets + " " + ticketWord +
                " reserved for " + formattedDate +
                " under " + name);

        scanner.close();







    }
}
