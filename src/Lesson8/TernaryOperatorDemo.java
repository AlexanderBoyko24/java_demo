package Lesson8;

import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
//        if (condition) <code>
//            else <code>
        int result;

        for (int i = -5; i < 6; i++) {
            if (i != 0)
            result = 100 / i;
            else result = 0;


            result = (i !=0) ? (100 / i) : 0;


            System.out.println("100 / " + i + " is equal to " + result);
        }


        String answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();

        if(a > 0) answer  = "a is greater than 0";
        else answer = "a is not greater than 0";

        answer = a > 0 ? "a is greater than 0" : "a is not greater than 0";

        System.out.println(answer);
    }

}
