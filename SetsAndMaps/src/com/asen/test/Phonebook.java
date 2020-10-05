package com.asen.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contact = scanner.nextLine();

        Map<String, String> phoneBook = new HashMap<>();
        while (!contact.equals("search")) {
            String name = contact.substring(0, contact.indexOf("-"));
            String number = contact.substring(contact.indexOf("-") + 1);

            phoneBook.put(name, number);
            contact = scanner.nextLine();

        }
        while (!contact.equals("stop")){
            String name=contact;
            if (phoneBook.containsKey(name)){
                System.out.println(name+" -> "+ phoneBook.get(name));
            }
            else if (!phoneBook.containsKey(name)&&!contact.equals("search")){
                System.out.println(String.format("Contact %s does not exist.",name));
            }


            contact=scanner.nextLine();
        }

    }
}
