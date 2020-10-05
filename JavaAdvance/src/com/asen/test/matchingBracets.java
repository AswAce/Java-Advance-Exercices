package com.asen.test;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Scanner;

public class matchingBracets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers=scanner.nextLine();
        ArrayDeque<Integer> numbersInBracets =new ArrayDeque<>();
        for (int i = 0; i <numbers.length() ; i++) {
            char current=numbers.charAt(i);
            if (current=='('){
                numbersInBracets.push(i);
            }
            else if (current==')'){
              int startIndex = numbersInBracets.pop();
                String result=numbers.substring(startIndex,i+1);
                System.out.println(result);
            }

        }
    }
}
