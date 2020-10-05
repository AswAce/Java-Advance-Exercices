package com.asen.test;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> deck = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    deck.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    deck.pop();
                    break;
                case "3":
//                    int max = Integer.MIN_VALUE;
//                    while (!deck.isEmpty()) {
//                        if (max <= deck.peek()) {
//                            max = deck.peek();
//                        }
//                        deck.pop();
//                    }
//                    System.out.println(max);
                    System.out.println(Collections.max(deck));
                    break;

            }

        }
    }
}
