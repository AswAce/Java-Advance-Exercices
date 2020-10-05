package com.asen.test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(numbers[0]);
        int s = Integer.parseInt(numbers[1]);
        int x = Integer.parseInt(numbers[2]);

//        String[] numbersToPush = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> result = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            result.push(scanner.nextInt());

        }
//        for (int i = 0; i < n; i++) {
//            result.push(Integer.parseInt(numbersToPush[i]));
//        }
        for (int i = 0; i < s; i++) {
            result.pop();
        }
        if (result.contains(x)) {
            System.out.println("true");
        }
        if (result.isEmpty()) {
            System.out.println("0");
        } else if (!result.contains(x)) {
            System.out.println(Collections.min(result));

//            int z = Integer.MAX_VALUE;
//            while (!result.isEmpty()) {
//                if (z >= result.peek()) {
//                    z = result.pop();
//                } else {
//                    result.pop();
//                }
//
//            }
//            System.out.println(z);
        }
    }
}
