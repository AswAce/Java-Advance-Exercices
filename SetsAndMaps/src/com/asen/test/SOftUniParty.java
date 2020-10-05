package com.asen.test;

import java.util.*;

public class SOftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guestRegistration = scanner.nextLine();
        Set<String> regular = new TreeSet<>();
        Set<String> vip = new TreeSet<>();
        while (!guestRegistration.equals("PARTY")) {
            char a = guestRegistration.charAt(0);
            if (Character.isDigit(a)) {
                vip.add(guestRegistration);
            } else {
                regular.add(guestRegistration);
            }
            guestRegistration = scanner.nextLine();
        }
        guestRegistration = scanner.nextLine();
        while (!guestRegistration.equals("END")) {
            char a = guestRegistration.charAt(0);
            if (Character.isDigit(a)) {
                vip.remove(guestRegistration);
            } else {
                regular.remove(guestRegistration);
            }
            guestRegistration = scanner.nextLine();
        }
        System.out.println(vip.size()+regular.size());
      vip.forEach(System.out::println);
      regular.forEach(System.out::println);
    }
}
