package com.pluralsight;

import java.util.Arrays;

public class TestStatistic {

    public static void main(String args[]) {
        int[] TestScorces = {63, 65, 60, 53, 58, 82, 72, 90, 79, 86};

        int sum = 0;
        int high = TestScorces[0];
        int low = TestScorces[0];

        for (int score : TestScorces) {
            sum += score;
            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;
            }
        }

        double average = (double) sum / TestScorces.length;

        System.out.println("Average score: " + average);
        System.out.println("High score: " + high);
        System.out.println("Low score: " + low);

    }
}
