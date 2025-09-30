package com.pluralsight;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score(format: Home:Visitor|21:9): ");
        String input = scanner.nextLine().trim();

        String[] sections = input.split("\\|");

        String[] teams = sections[0].split(":");  // ["Home", "Visitor"]
        String[] scores = sections[1].split(":"); // ["21", "9"]

        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();





        }

    }

