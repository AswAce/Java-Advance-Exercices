package com.asen.test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new TreeMap<>();
        items.put("shards", 0);
        items.put("motes", 0);
        items.put("fragments", 0);
        Map<String, Integer> junk = new TreeMap<>();
        boolean isObtained = false;
        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int count = Integer.parseInt(tokens[i]);
                String type = tokens[i + 1].toLowerCase();
                if (items.containsKey(type)) {
                    addItem(items, type, count);
                    isObtained = hasLegendary(items, type);
                    if (isObtained) {
                        break;
                    }
                } else {
                    addItem(junk, type, count);
                }
            }
        }

        items.entrySet().stream().
                sorted((i1, i2) -> Integer.compare(i2.getValue(), i1.getValue())).
                forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));
        junk.forEach((key, value) -> System.out.println(String.format("%s: %d", key, value)));

    }

    private static boolean hasLegendary(Map<String, Integer> items, String type) {
        int count = items.get(type);
        if (items.get(type) >= 250) {
            items.put(type, count - 250);
            switch (type) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    return true;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    return true;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    return true;
            }

        }
        return false;
    }

    private static void addItem(Map<String, Integer> map, String key, int value) {

        map.putIfAbsent(key, 0);
        int count = map.get(key);
        map.put(key, count + value);
    }
}
