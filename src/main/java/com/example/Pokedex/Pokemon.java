package com.company.pokedex;

import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private List<String> types;
    private int height;
    private int weight;
    private int baseExperience;

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

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
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

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Pokemon(int id, String name, List<String> types, int height, int weight, int baseExperience) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
    }

    public Pokemon() {
    }
}
