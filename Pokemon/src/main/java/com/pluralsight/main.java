package com.pluralsight;

import java.util.ArrayList;

public class main {

    public static void main(String[] args){


    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

pokemons.add(new Pikachu.pikachu("Pika"));
pokemons.add(new Mewto("Mewto"));

for (int i = 0; i < pokemons.size() ; i++) {
        pokemons.get(i).attack();
    }
}}
