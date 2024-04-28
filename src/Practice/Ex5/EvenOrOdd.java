package Practice.Ex5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число:");
            int number = scanner.nextInt();

            if (number <= 0)
                break;

            if ((number % 2) == 0) System.out.println(number + " - Ваше число четное");
            else {
                System.out.println(number + " - Ваше число нечетное");

            }
        }
    }
}
