package com.asen.test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> skobi = new ArrayDeque<>();
        String input = scanner.nextLine();
        boolean b=false;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                skobi.push(current);
            } else if (current == ')') {
                if (skobi.pop() == '(') {
                    b = true;
                }
            } else if (current == ']') {
                if (skobi.pop() == '[') {
                    b = true;
                }
            } else if (current == '}') {
                if (skobi.pop() == '(') {
                    b = true;
                }
            }

        }
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


