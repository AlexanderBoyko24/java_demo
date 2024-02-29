package Lesson2;

import java.util.Scanner;

public class LogicalDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Hello dear " + name + "!");

        System.out.println("Do you have a job? Answer yes or no");
        String answer = input.nextLine();

        System.out.println("Are you a hardworking person?");
        String answer2 = input.nextLine();


        if (answer2.equals("yes")  && answer.equals("yes")) System.out.println("Congrats!");
        else System.out.println("Do you want to work with us?");
    }
}
