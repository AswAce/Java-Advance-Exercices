package com.asen.test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class UpdateBrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistorySteak = new ArrayDeque<>();
        String navigation = scanner.next();
        String current = "";
        while (!navigation.equals("Home")) {
            switch (navigation) {
                case "back":
                    if (!browserHistorySteak.isEmpty()) {
                        current = browserHistorySteak.pop();

                    } else {
                        System.out.println("no previous URLs");
                        navigation = scanner.nextLine();
                        continue;
                    }
                    break;
                case "forword":


                    break;

                default:
                    if (!current.equals("")) {
                        browserHistorySteak.push(current);
                    }
                    current = navigation;
                    break;
            }
            System.out.println(current);
            navigation = scanner.next();
        }
    }

}
