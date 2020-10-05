package com.asen.test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg=scanner.nextLine();
        Map<Character,Integer> letters=new TreeMap<>();

        for (int i = 0; i <msg.length() ; i++) {
            char element=msg.charAt(i);
            letters.putIfAbsent(element,0);
            letters.put(element,letters.get(element)+1);
        }
        letters.forEach((key, value) -> System.out.println(String.format("%s: %s time/s",key,value)));
    }
}
