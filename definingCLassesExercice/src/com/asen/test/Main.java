package com.asen.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while (!"Tournament".equals(command)) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, element, health);
            trainers.putIfAbsent(trainer.getName(), trainer);
            trainers.get(trainer.getName()).addPokemon(pokemon);
            command = scanner.nextLine();
        }
        String elements = scanner.nextLine();
        while (!elements.equals("End")) {
            for (Trainer trainer : trainers.values()) {
                trainer.dmgPokemons(elements);
          trainer.checkIfPokemonIsDead();
            }
            elements = scanner.nextLine();
        }
        trainers.entrySet().stream().sorted((z1, z2) -> {
            int one = z1.getValue().getNumberOfBadges();
            int two = z2.getValue().getNumberOfBadges();
            return Integer.compare(two, one);
        })
                .forEach(e -> System.out.println(e.getValue().getName() + " " + e.getValue().getNumberOfBadges() + " " +  e.getValue().countPokemons()));
           }

}


