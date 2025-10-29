package com.pluralsight;

public class Pikachu extends Pokemon {

    public Pikachu(String name) {
        super(name);
    }

    public class pikachu extends Pokemon {
        public pikachu(String name) {
            super(name);
        }


    @Override
    public String attack() {
        System.out.println("Thunder bolt!!");
        return "";
    }
}
