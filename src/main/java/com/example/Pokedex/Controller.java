package com.example.Pokedex;

import com.example.Pokedex.model.Pokemon;
import com.example.Pokedex.model.Type;
import org.apache.juli.logging.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    private final PokeService pokeService = new PokeService();

    public void run() throws IOException {
        displayMainMenu();
    }
    private void displayMainMenu() throws IOException {

        System.out.print("Enter the name of a pokemon to show it's Pokedex details: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<Type> types = pokeService.getPokeTypes(input.toLowerCase());
        Pokemon pokemon = pokeService.getPokemon(input.toLowerCase());
        try{
            String str = pokemon.toString();
            System.out.println(capFirstChar(str));
            pokeService.displayPokeTypes(types);
        }catch (NullPointerException e){
            Logger.log(e.getMessage());
        }
    }
    private String capFirstChar(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
