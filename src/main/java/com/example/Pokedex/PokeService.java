package com.example.Pokedex;

import com.example.Pokedex.model.Pokemon;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class PokeService {
    public static String API_BASE_URL = "https://pokeapi.co/api/v2/";
    private final RestTemplate restTemplate = new RestTemplate();

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
