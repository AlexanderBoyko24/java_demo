package Practice.Ex7;

import java.util.Scanner;

public class Rows {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;

        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");

        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println(symbol);

            }
        }
    }

