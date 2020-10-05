package com.asen.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double,Integer> numbers=new LinkedHashMap<>();
        double[]input= Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        for (int i = 0; i <input.length ; i++) {
            numbers.putIfAbsent(input[i],0);
            numbers.put(input[i],numbers.get(input[i])+1);
        }
        numbers.forEach((key, value) -> System.out.println(String.format("%s -> %s", key, value)));
    }
}
