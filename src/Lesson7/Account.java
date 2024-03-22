package Lesson7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    String phoneNumber;
    String name;
    byte age;

    Account(String phoneNumber, String name){
        while (! Pattern.matches("\\d{9}", phoneNumber) | !Pattern.matches("[A-Z][a-z]{1,10}", name)) {
            System.out.println("Sorry, this number or this name does not match");
            Scanner input = new Scanner(System.in);
            phoneNumber = input.nextLine();
            name = input.nextLine();
        }

        this.phoneNumber = phoneNumber;
        this.name = name;
        System.out.println("Success!!!");

    }
}
