package com.company.pokedex;

import java.util.Scanner;

public class Controller {
    public void run(){
        displayMainMenu();
    }
    private void displayMainMenu(){
        System.out.print("Enter the name of a pokemon to show it's Pokedex details: ");
        Scanner scanner = new Scanner(System.in);
        String pokemon = scanner.next();


    }
}
