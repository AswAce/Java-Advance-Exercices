package com.asen.test;

import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotsInput = scanner.nextLine().split(";");
        ArrayDeque<String> productsQueue = new ArrayDeque<>();
        String[] startingTIme = scanner.nextLine().split(":");
        int hours = Integer.parseInt(startingTIme[0]);
        int minutes = Integer.parseInt(startingTIme[1]);
        int secs = Integer.parseInt(startingTIme[2]);

        String products = scanner.nextLine();
        while (!"End".equals(products)) {
            productsQueue.add(products);
            products = scanner.nextLine();
        }

        for (int i = 0; i < robotsInput.length; i++) {
            String[] robotPower = robotsInput[i].split("-");
            String nameRobot = robotPower[0];
            int RobotWorkingTIme = Integer.parseInt(robotPower[1]);

//            System.out.println(String.format("%s - %s [%s]", nameRobot, productsQueue.remove(), Arrays.toString(startingTIme)));
//            if (i == robotsInput.length - 1) {
//                i = getNumberRobot(robotsInput);
//            }
            if (productsQueue.isEmpty()) {
                break;
            }
//                while (!productsQueue.isEmy()){
//                System.out.println(robotsInput[i]+ productsQueue.remove());
//            }

        }
    }

//    private static int getNumberRobot(String[] robotsInput) {
//
//    }
}
