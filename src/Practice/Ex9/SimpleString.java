package Practice.Ex9;
import java.util.Scanner;

public class SimpleString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Повернутая строка:");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

        scanner.close();
    }
}
