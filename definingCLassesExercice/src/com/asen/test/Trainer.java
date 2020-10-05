package com.asen.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Trainer {
    private String name;
    private int numberOfBadges;
    private Map<String, List<Pokemon>> collectionOfPokemon;
    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.setPokenoms();
    }
    private void setPokenoms() {
        this.collectionOfPokemon = new HashMap<>();
        this.collectionOfPokemon.put("Fire", new ArrayList<>());
        this.collectionOfPokemon.put("Water", new ArrayList<>());
        this.collectionOfPokemon.put("Electricity", new ArrayList<>());
    }
    public void addPokemon(Pokemon pokemon) {
        String pokeElement = pokemon.getElement();
        this.collectionOfPokemon.putIfAbsent(pokeElement, new ArrayList<>());
        this.collectionOfPokemon.get(pokeElement).add(pokemon);
    }
    public void addBadge() {
        this.numberOfBadges++;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public Map<String, List<Pokemon>> getCollectionOfPokemon() {
        return collectionOfPokemon;
    }

    public void checkIfPokemonIsDead() {
        for (List<Pokemon> pokemons : this.collectionOfPokemon.values()) {
            pokemons.removeIf(pokemon -> pokemon.getHeath() <= 0);
        }
    }

    public void dmgPokemons(String elements) {
        if (getCollectionOfPokemon().get(elements).isEmpty()) {
           getCollectionOfPokemon().forEach((key, value) -> value.
                    forEach(Pokemon::hitPOkemon));
        }
        else {addBadge();}
    }
    public int countPokemons() {
        int count=0;
        for (List<Pokemon> value : collectionOfPokemon.values()) {
            count+=value.size();
        }
        return count;
    }
}


