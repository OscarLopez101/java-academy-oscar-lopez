package com.pluarlsight;

import java.util.Scanner;

public class Sandwichshop {

    public static void main(String[] args) {
        String regular = "regular";
        String large = "large";
        String yes = "yes";
        String no = "no";

        Scanner scanner = new Scanner(System.in);

        System.out.println("What Size of Sandwich do you want, Regular or Large: ");
        String choice = scanner.nextLine();

        double price = 0;

        if (choice.equals(regular)) {
            price = 5.45;
            System.out.println("The subtotal will be $" + price);
        } else if (choice.equals(large)) {
            price = 8.95;
            System.out.println("The subtotal will be $" + price);
        } else
            System.out.println("Invalid option pick regular of large!");

        System.out.println("Do you want your Sandwich loaded (yes or no): ");
        String loaded = scanner.nextLine();

        if (loaded.equals(yes) && choice.equals(regular)) {
            price = price + 1;
            System.out.println("The new price is: $" + price);
        } else if (loaded.equals(yes) && choice.equals(large)) {
            price = price + 1.75;
            System.out.println("The new price is: $" + price);
        } else
            System.out.println("no change in price");




        System.out.println("What is your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            price = price - (price * 0.1);
            System.out.println("Your new total is: $"  +price);
        } else if (age >= 65) {
            price = price - (price * 0.2);
            System.out.println("Your new total is: $" + price);
        } else {
            System.out.println("Your new total is: $" +price);
        }

        scanner.close();
    }

}

