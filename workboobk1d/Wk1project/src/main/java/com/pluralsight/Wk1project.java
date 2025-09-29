package com.pluralsight;

import java.util.Scanner;

public class Wk1project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Which do you want to do (Mortgage calculator(1) or future puts(2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter loan amount: ");
            double principle = scanner.nextDouble();

            System.out.println("Enter Interset Rate: ");
            double rate = scanner.nextDouble();

            System.out.println("Enter the Loan term in years: ");
            int year = scanner.nextInt();

            double monthlyrate = ((rate / 100) / 12);
            int numberofpayments = (year * 12);

            double monthlypayments = principle * (monthlyrate * Math.pow(1 + monthlyrate, numberofpayments)) / (Math.pow(1 + monthlyrate, numberofpayments) - 1);

            System.out.printf("Your monthly payment is: $%.2f%n", monthlypayments);

        } else if (choice == 2) {
            System.out.println("Enter initial deposit amount: ");
            double principle = scanner.nextDouble();

            System.out.println("Enter annual interest rate (e.g. 5 for 5%): ");
            double rate = scanner.nextDouble();

            System.out.println("Enter number of years: ");
            int years = scanner.nextInt();

            int compoundsPerYear = 1;

            double rateperperiod = rate / 100 / compoundsPerYear;
            int totalperiods = years * compoundsPerYear;

            double futurevalues = principle * Math.pow(1 + rateperperiod, totalperiods);

            System.out.printf("The future value of your investment is: $%.2f%n", futurevalues);

        }
    }

}