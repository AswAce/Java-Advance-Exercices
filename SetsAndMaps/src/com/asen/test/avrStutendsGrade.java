package com.asen.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class avrStutendsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            String name = token[0];
            double grade = Double.parseDouble(token[1]);
            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.forEach((key, value) ->
                System.out.println(String.format("%s -> %s (avg: %.2f)", key, getGrades(value),getAvarege(value) )));
    }

    private static Double getAvarege(ArrayList<Double> value) {
      return  value.stream().mapToDouble(d->d).average().orElse(0.00);
    }

    private static String getGrades(ArrayList<Double> value) {
//        StringBuilder grade = new StringBuilder();
//        for (Double aDouble : value) {
//            grade.append(aDouble).append(" ");
//        } Като долното
//        return grade.toString().trim();
        return value.
                stream().
                map(e->String.format("%.2f",e)).
                collect(Collectors.joining(" ")).trim();
    }
}
