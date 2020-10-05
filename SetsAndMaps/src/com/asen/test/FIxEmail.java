package com.asen.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FIxEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOrEmail = scanner.nextLine();
        ArrayList<String> people = new ArrayList<>();
        Map<String, String> combination = new LinkedHashMap<>();
        while (!nameOrEmail.equals("stop")) {
            people.add(nameOrEmail);
            nameOrEmail = scanner.nextLine();
        }
        for (int i = 0; i < people.size(); i += 2) {
            String s = people.get(i + 1);
            if (checkDomain(s)) {
                combination.put(people.get(i), people.get(i + 1));
            }
        }
        combination.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    private static boolean checkDomain(String s) {
        String domain = s.substring(s.lastIndexOf(".") + 1);
        return !domain.equals("us") && !domain.equals("uk") && !domain.equals("com");

    }
}
