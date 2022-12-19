package com.example.Pokedex;

import com.example.Pokedex.model.Pokemon;
import com.example.Pokedex.model.Type;
import com.fasterxml.jackson.databind.DeserializationFeature;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class PokeService {
    public static String API_BASE_URL = "https://pokeapi.co/api/v2/";
    private final RestTemplate restTemplate = new RestTemplate();
    public List<Type> getPokeTypes(String name) throws IOException {
            String API_BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Pokemon pokemon = mapper.readValue(new URL(API_BASE_URL + name), Pokemon.class);

        return pokemon.getTypes();
    }
    public void displayPokeTypes(List<Type> types){
        System.out.print("Type(s): ");
        for(Type type : types){
            System.out.print(type.getType().getName().toUpperCase() + " ");
        }
    }
    public Pokemon getPokemon(String name){
        Pokemon pokemon = null;
        try {
            pokemon = restTemplate.getForObject(API_BASE_URL + "pokemon/" + name, Pokemon.class);
            Logger.log("Successful GET" + " '" + name + "'");
        }catch (RestClientResponseException e){
            Logger.log(e.getStatusText());
        }catch(ResourceAccessException e){
            Logger.log(e.getMessage());
        }
        return pokemon;
    }
}
