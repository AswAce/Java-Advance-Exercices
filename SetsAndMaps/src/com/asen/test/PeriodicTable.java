package com.asen.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            elements.addAll(Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toSet()));
        }
        elements.forEach(e-> System.out.print(e+" "));
    }
}
