package HomeWork;
import java.util.Scanner;
public class NumberEvenOrOdd {
    public static void main(String[] args) {

        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        if ((i % 2) == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println ("Your number is odd");
        }

    }
}



