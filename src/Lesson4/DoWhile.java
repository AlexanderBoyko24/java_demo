package Lesson4;

import java.io.IOException;

public class DoWhile {
    public static void main (String [] args) throws IOException {
//        do {
//            some code...
//        } while(condition)
        char ch;

        do {
            System.out.println("press ane key and then [Enter]:");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }

}
