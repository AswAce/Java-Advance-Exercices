package com.asen.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();
        Map<String, Integer> all = new LinkedHashMap<>();

        ArrayList<String> a = new ArrayList<>();
        while (!"stop".equals(info)) {
            a.add(info);
            info = scanner.nextLine();
        }
        for (int i = 0; i < a.size(); i += 2) {
            all.putIfAbsent(a.get(i), 0);
            all.put(a.get(i),all.get(a.get(i))+Integer.parseInt(a.get(i+1)));
        }
        all.forEach((key, value) -> System.out.println(String.format("%s -> %s", key, value)));
    }
}

