package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.loadInventory("Inventory.csv"); // file in resources
        inventory.printInventory();
    }
}
