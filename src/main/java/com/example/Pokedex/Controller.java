package com.example.Pokedex;

import com.example.Pokedex.model.Pokemon;
import org.apache.juli.logging.Log;

import java.util.Locale;
import java.util.Scanner;

public class Controller {
    private final PokeService pokeService = new PokeService();

    public void run(){
        displayMainMenu();
    }
    private void displayMainMenu(){

        System.out.print("Enter the name of a pokemon to show it's Pokedex details: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Pokemon pokemon = pokeService.getPokemon(name.toLowerCase());
        try{
            String str = pokemon.toString();
            System.out.println(str);
        }catch (NullPointerException e){
            Logger.log(e.getMessage());
            System.out.println("Result was null. Please check your spelling.");
        }


    }
}
