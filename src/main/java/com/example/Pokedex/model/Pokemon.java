package com.example.Pokedex.model;

import com.example.Pokedex.PokeService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;
import java.util.List;

public class Pokemon {

    private int id;
    private String name;
    @JsonProperty("base_experience")
    private int baseExperience;
    private int height;
    private int weight;
    private List<Type> types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Type> getTypes() {
        return types;
    }

    public Pokemon(int id, String name, int baseExperience, int height, int weight, List<Type> types) {
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
        this.height = height;
        this.weight = weight;
        this.types = types;
    }

    public Pokemon() {
    }

    @Override
    public String toString() {
        PokeService pokeService = new PokeService();
        return getName() + '\n' +
                "ID:" + id + '\n' +
                "Base Experience: " + baseExperience + '\n' +
                "Height: " + height + '\n' +
                "Weight: " + weight;
    }

}

