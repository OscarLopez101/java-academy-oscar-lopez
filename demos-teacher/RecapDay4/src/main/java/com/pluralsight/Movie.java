package com.pluralsight;

public class Movie {
    public static void main(String[] args) {
        int me = 1;

        String movieTitle = "cars 2 ";
        int numberOfFriends = 5;
        double pizzaPerSlice = 1.25;
        boolean isTherePopcorn = true;

        System.out.println("We are going to watch " + movieTitle + " and going to eat pizza with " + numberOfFriends + " people.");

        double totalCostOfPizza = pizzaPerSlice * (numberOfFriends + me);
        System.out.println("The cost for everywne is " + totalCostOfPizza);

        if (isTherePopcorn) {
            System.out.println("We have popcorn");
        } else {
            System.out.println("There is n o popcorn");
        }


    }}