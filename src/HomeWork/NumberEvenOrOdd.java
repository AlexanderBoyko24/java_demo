package HomeWork;
import java.util.Scanner;
public class NumberEvenOrOdd {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your number (enter 0 to exit): ");
            int i = input.nextInt();

            if (i == 0) break;

            if ((i % 2) == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");

            }

        }
    }
}



