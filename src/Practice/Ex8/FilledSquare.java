package Practice.Ex8;

import java.util.Scanner;

public class FilledSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;

        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}


