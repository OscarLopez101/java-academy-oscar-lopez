package com.pluralsight;


public class Main {
    public static void main(String[] args) {
        doubleAge(20);
        yearsUntilRetirement(20);


    }

    public static void doubleAge(int age) {
        int result = age * 2;
        System.out.println("The doubled age is " + result );
    }


    public static void yearsUntilRetirement(int currAge) {
        System.out.println("Years left until retirement: " + (65 - currAge));
    }

}