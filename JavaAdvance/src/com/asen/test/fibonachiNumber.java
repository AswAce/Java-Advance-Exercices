package com.asen.test;

import java.util.Scanner;

public class fibonachiNumber {
    private  static long[]memorization;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        memorization =new long[n+1];

        System.out.println(fib(n ));

    }


    public static long fib(int n) {
        if (n <= 2) {
            return n;
        }
        if (memorization[n]!=0){return memorization[n];}
        return memorization[n]= fib(n - 1) + fib(n - 2);
    }
}
