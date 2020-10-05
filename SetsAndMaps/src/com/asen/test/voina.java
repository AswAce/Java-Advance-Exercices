package com.asen.test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> playerOne = Arrays.
                stream(scanner.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).
                boxed().
                collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> playerTwo = Arrays.
                stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).
                collect(Collectors.toCollection(LinkedHashSet::new));
        for (int i = 1; i <= 50; i++) {
            int playerOneCard = playerOne.iterator().next();
            playerOne.remove(playerOneCard);
            int playerTwoCard = playerTwo.iterator().next();
            playerTwo.remove(playerTwoCard);
            if (playerOneCard > playerTwoCard) {
                playerOne.add(playerOneCard);
                playerOne.add(playerTwoCard);
                playerTwo.remove(playerTwoCard);
            } else if (playerOneCard < playerTwoCard) {
                playerTwo.add(playerOneCard);
                playerTwo.add(playerTwoCard);
                playerOne.remove(playerOneCard);
            }
            if (playerOne.size() == 0 || playerTwo.size() == 0) {
                i = 50;
            }
        }
        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerOne.size() < playerTwo.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
