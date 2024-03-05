package Lesson3;

import java.util.Scanner;

public class InputOutputScanner {
    public static void main(String[] args)  {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your char");
        char ch1 = input.nextLine().charAt(0);
        System.out.println("You pressed "+ ch1);


}
}
