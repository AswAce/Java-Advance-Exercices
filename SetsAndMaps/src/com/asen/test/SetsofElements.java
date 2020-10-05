package com.asen.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < n[0]; i++) {
            x.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < n[1]; i++) {
            y.add(Integer.parseInt(scanner.nextLine()));
        }
     x.retainAll(y);
        x.forEach(e-> System.out.print(e+" "));
    }
}
