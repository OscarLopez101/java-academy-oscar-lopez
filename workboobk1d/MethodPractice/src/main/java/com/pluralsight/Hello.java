package com.pluralsight;

import java.util.Scanner;


public class Hello {

    public static void main(String[] args) {

        String correctPassword = "1234";
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the password: ");
        String password = scanner.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Right password");
        } else {
            System.out.println("Try again");
        }
    }
}

