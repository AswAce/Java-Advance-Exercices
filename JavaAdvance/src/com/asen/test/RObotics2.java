package com.asen.test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class RObotics2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotsInput = scanner.nextLine().split(";");
        String[] robots = new String[robotsInput.length];
        int[] processTimes = new int[robotsInput.length];
        int[] currentRobotTime = new int[robotsInput.length];

        for (int i = 0; i < robotsInput.length; i++) {
            String[] token = robotsInput[i].split("-");
            robots[i] = token[0];
            processTimes[i] = Integer.parseInt(token[1]);
            currentRobotTime[i] = 0;
        }
//        String[] startingTIme = scanner.nextLine().split(":");
        int[] inputTime = Arrays.stream(scanner.nextLine().split(":")).
                mapToInt(Integer::parseInt).toArray();
//        int hours = Integer.parseInt(startingTIme[0]);
//        int minutes = Integer.parseInt(startingTIme[1]);
//        int secs = Integer.parseInt(startingTIme[2]);
        int time = inputTime[0] * 3600 + inputTime[1] * 60 + inputTime[2];
        ArrayDeque<String> productsQueue = new ArrayDeque<>();
        String products = scanner.nextLine();
        while (!"End".equals(products)) {
            productsQueue.add(products);
            products = scanner.nextLine();
        }
//        while (!(products=scanner.nextLine()).equals("End")){}

        while (!productsQueue.isEmpty()) {
            for (int i = 0; i < robots.length; i++) {
                if (currentRobotTime[i] > 0) {
                    currentRobotTime[i]--;
                }
            }
            time++;
            String material = productsQueue.poll();
            boolean isTaken = false;
            for (int i = 0; i < robots.length; i++) {

                if (currentRobotTime[i] == 0) {
                    System.out.println(String.format("%s - %s %s", robots[i], material, get(time)));
                    currentRobotTime[i] = processTimes[i];
                    isTaken = true;
                    break;
                }
            }
            if (!isTaken) {
                productsQueue.offer(material);
            }
        }

    }

    private static String get(int time) {
        int hours=time/3600 %24;
        int mins=time/60%60;
        int secs=time%60;
//       същото като %24
//        if (hours>=24){
//            hours=hours-24;
//        }
        return String.format("[%02d:%02d:%02d]",hours,mins,secs);
    }
}
