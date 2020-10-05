package com.asen.test;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  car=scanner.nextLine();
        Set<String >parking=new LinkedHashSet<>();
        while (!car.equals("END")){
            String command=car.substring(0,car.indexOf(","));
            String carNumber=car.substring(car.indexOf(",")+2);
            if (command.equals("IN")){
                parking.add(carNumber);
            }
            else if (command.equals("OUT")){
                parking.remove(carNumber);
            }


            car=scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parking.forEach(System.out::println);
        }

    }
}
