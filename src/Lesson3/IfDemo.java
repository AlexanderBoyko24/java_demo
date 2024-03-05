package Lesson3;

import java.util.Scanner;

public class IfDemo {
    public static void main (String [] args){

       /* if (condition) {
            some code
        } else {
            some code
        }*/

        char ch = 0, answer = 'M';
        System.out.println("A letter from diapason  A-Z should be guessed");
        System.out.println("Try it!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your char");
         ch = input.nextLine().charAt(0);

        if (ch == answer) {
            System.out.println("Yoy are right");
          System.out.println("You won from the first try!");
        } else {
            System.out.println("You are wrong");
        }
        System.out.println("Thank for your try");
    }
}
