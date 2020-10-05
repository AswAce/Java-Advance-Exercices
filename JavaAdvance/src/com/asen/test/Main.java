package com.asen.test;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistorySteak = new ArrayDeque<>();
        String navigation = scanner.next();
        String current = "";
        while (!navigation.equals("Home")) {
            if (navigation.equals("back")) {

                if (!browserHistorySteak.isEmpty()) {
                    current = browserHistorySteak.pop();

                } else {
                    System.out.println("no previous URLs");
                    navigation = scanner.nextLine();
                    continue;
                }

            } else {
                if (!current.equals("")) {
                    browserHistorySteak.push(current);
                }
                current = navigation;
            }
            System.out.println(current);
            navigation = scanner.next();
        }
    }
}
