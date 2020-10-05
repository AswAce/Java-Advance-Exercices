package com.asen.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class superMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Map<String, Double>> superMarkets = new TreeMap<>();
        while (!"Revision".equals(command)) {
            String[] token = command.split(", ");
            String store = token[0];
            String product = token[1];
            double price = Double.parseDouble(token[2]);
            superMarkets.putIfAbsent(store, new LinkedHashMap<>());
            superMarkets.get(store).putIfAbsent(product, price);
            command = scanner.nextLine();
        }
        for (String s : superMarkets.keySet()) {
            System.out.println(s+"->");
            superMarkets.get(s).
                    forEach((key, value) -> System.out.println(String.format("Product: %s, Price: %s",key,value)));
        }
    }
}
