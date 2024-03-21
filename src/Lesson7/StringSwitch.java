package Lesson7;

import java.util.Scanner;
import java.util.SortedMap;

public class StringSwitch {
    public static void main (String [] args){


        System.out.println("Enter any command of the folowing");
        System.out.println("Connect\ncancel\ndisconnect:");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        switch (command){
            case "connect" -> System.out.println("connecting");
            case "cancel" -> System.out.println("canceling");
            case "disconnect" -> System.out.println("disconnecting");
            default -> System.out.println("Unknown command");
        }
    }
}
