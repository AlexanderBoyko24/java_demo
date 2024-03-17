package HomeWork;

import java.io.IOException;

public class UpperAndLowerCase {
    public static void main(String[] args) throws IOException {
        char ch;
        char upper ;
        char lower;

        upper = 0;
        lower  = upper-=32;
        upper++;

        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read(); // получить символ с клавиатуры
        } while (ch != '.') ;

           }
}