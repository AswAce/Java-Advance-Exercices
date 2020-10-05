package com.asen.test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rules = scanner.nextLine().split("\\s+");
        String[] numbersToAdd = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int add = Integer.parseInt(rules[0]);
        int remove = Integer.parseInt(rules[1]);
        int present = Integer.parseInt(rules[2]);
        for (int i = 0; i < add; i++) {
            queue.add(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < remove; i++) {
            queue.remove();
        }
        if (queue.contains(present)){
            System.out.println("true");
        }
        if (queue.isEmpty()){
            System.out.println("0");
        }
        else if (!queue.contains(present)){
            int smallest=Integer.MAX_VALUE;
           while (!queue.isEmpty()){

            if (smallest>=queue.peek()){
                smallest=queue.peek();
            }
            queue.remove();
           }
            System.out.println(smallest);
        }
    }
}
