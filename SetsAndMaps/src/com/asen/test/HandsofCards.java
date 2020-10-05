package com.asen.test;

import java.util.*;

public class HandsofCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String peopleCards = scanner.nextLine();
        Map<String, Set<String>> playerHand = new LinkedHashMap<>();
        while (!"JOKER".equals(peopleCards)) {
            String[] token = (peopleCards.split(": "));
            String name = token[0];
            String[] cards = token[1].split(", ");
            playerHand.putIfAbsent(name, new HashSet<>());
            playerHand.get(name).addAll(Arrays.asList(cards));
            peopleCards = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry : playerHand.entrySet()) {
            int sum = getSUmFromCards(entry.getValue());
            System.out.println(entry.getKey() + ": " + sum);
        }
    }

    private static int getSUmFromCards(Set<String> value) {
        int sum = 0;
        for (String s : value) {
            String first = (s.substring(0, s.length() - 1));
            String second = s.substring(s.length() - 1);

            int f = getNumber(first);
            int sec = getSecond(second);
            int multy = f * sec;
            sum += multy;
        }
        return sum;
    }

    private static int getSecond(String second) {
        switch (second) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
            default:
                return 0;
        }

    }

    private static int getNumber(String first) {

        switch (first) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;

            default:
                return 0;

        }

    }
}
