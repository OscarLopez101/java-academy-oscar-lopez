package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            String Add = "A";
            String Subtract = "S";
            String Multiply = "M";
            String Divide = "D";


            System.out.println("Possible calculations: ");
            System.out.println("(A)dd");
            System.out.println("(S)ubtract");
            System.out.println("(M)ultiply");
            System.out.println("(D)ivide");

            System.out.println("Please select an option: ");
            String calculation = scanner.next();

            boolean valid = true;
            int Result = 0;
            String symbol = "";

            if (calculation.equals(Add)) {
                Result = num1 + num2;
                symbol = "+";
            } else if (calculation.equals(Subtract)) {
                Result = num1 - num2;
                symbol = "-";
            } else if (calculation.equals(Multiply)) {
                Result = num1 * num2;
                symbol = "*";
            } else if (calculation.equals(Divide)) {
                Result = num1 / num2;
                symbol = "/";
            } else
                System.out.println("Invalid operator!!");


            if (valid) {
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + Result);
            }
            scanner.close();
        }}

