package Exercise3;

import java.io.IOException;

public class Guess2 {
    public static void main (String [] args) throws IOException {
        char ch, answer = 'S';

        System.out.println("Thoughtful letter from range A - Z.");
        System.out.print("Try to guess it:");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Right");
        else System.out.println("Sorry, you did not guess");

    }
}
