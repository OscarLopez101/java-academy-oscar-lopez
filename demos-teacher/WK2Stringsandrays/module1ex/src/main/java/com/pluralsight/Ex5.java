package com.pluralsight;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();

        System.out.println("Enter billing Street: ");
        String billingSt = scanner.nextLine();

        System.out.println("Enter Billing city: ");
        String billingCity = scanner.nextLine();

        System.out.println("Enter Billing State: ");
        String billingState = scanner.nextLine();

        System.out.println("Enter billing zipcode: ");
        String billingZipcode = scanner.nextLine();

        System.out.println("Enter Shipping Street: ");
        String shippingSt = scanner.nextLine();

        System.out.println("Enter Shipping city: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Enter Billing State: ");
        String shippingState = scanner.nextLine();

        System.out.println("Enter billing zipcode: ");
        String ShippingZipcode = scanner.nextLine();

        String cityStateZip = billingCity + ", " + billingSt + " " + billingZipcode;
        String ShippingcityStateZip = shippingCity + ", " + shippingSt + " " + ShippingZipcode;

        StringBuilder sb = new StringBuilder();

        sb.append(name).append("\n")
                .append("Billing Address: ").append("\n")
                .append("address: ").append(billingSt).append("\n")
                .append(cityStateZip).append("\n\n")
                .append("Shipping Address: ").append("\n")
                .append("address: ").append(shippingSt).append("\n")
                .append(ShippingcityStateZip);




        System.out.println("\n");
        System.out.println(sb.toString());







    }


}
