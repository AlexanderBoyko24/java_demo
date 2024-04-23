package Lesson15;

import java.util.Locale;
import java.util.Scanner;

public class EnumBemo {
    public static void main(String[] args) {
        Transport tr;

        tr = Transport.AIRPLANE;

        System.out.println("Value of tr: " + tr);

        if (tr == Transport.TRAIN) {
            System.out.println("tr is equal to TRAIN");
        }

        switch (tr) {
            case CAR -> System.out.println("Its a car!");
            case TRUCK -> System.out.println("Its a truck!");
            case AIRPLANE -> System.out.println("Its a airplane!");
            case TRAIN -> System.out.println("Its a train!");
            case BOAT -> System.out.println("Its a boat!");
        }

        Transport[] allTransports = Transport.values();

        try {
            tr = Transport.valueOf("HORSE");
        } catch (IllegalArgumentException e) {
            tr = Transport.UNDEFINED;
        }

        System.out.println("Choose your transport among following");
        for (Transport t : allTransports){
            System.out.println(t);
            System.out.println("Speed: " + t.getSpeed());
    }

        Scanner in = new Scanner(System.in);
        String candidate = in.nextLine();

        try {
            tr = Transport.valueOf(candidate.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry!There is no such type. " +
                                 "The value will set to undefined");
          tr = Transport.UNDEFINED;
        }

        System.out.println("tr is " + tr);

    }
}







