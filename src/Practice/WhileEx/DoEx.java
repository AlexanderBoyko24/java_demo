package Practice.WhileEx;

import java.util.Scanner;

public class DoEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.println("Hello " + name);

    }
}
