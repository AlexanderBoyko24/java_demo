package Practice.Ex7;

import java.util.Scanner;

public class Columns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int columns;
        String symbol = "";


        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for (int j = 1; j <= columns; j++) {
            System.out.print(symbol);
        }
    }
}

