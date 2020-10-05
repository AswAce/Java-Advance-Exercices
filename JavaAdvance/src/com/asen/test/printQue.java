package com.asen.test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String printing = scanner.nextLine();
        while (!"print".equals(printing)) {
            if (printing.equals("cancel")) {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " +queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }
            else {
                queue.offer(printing);
            }
            printing = scanner.nextLine();
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
