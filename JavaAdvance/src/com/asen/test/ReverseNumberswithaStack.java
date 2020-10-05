package com.asen.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String[]numbers=scanner.nextLine().split("\\s+");
                ArrayDeque<Integer> result =new ArrayDeque<>();
        for (String number : numbers) {
            result.push(Integer.parseInt(number));

        }
        while (!result.isEmpty()){
            System.out.print(result.pop()+" ");
        }

    }
}
