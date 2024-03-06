package Exercise3;

import java.io.IOException;

public class Guess3 {
    public static void main (String [] args) throws IOException {
        char ch, answer = 'S';

        System.out.println("Guessed letter is in a range A-Z.");
        System.out.print("Try to guess it:");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Right");
        else{
            System.out.println("Sorry, the letter is...");
            if (ch < answer)
                System.out.println("closer to the ending of alphabet");
            else System.out.println("closer to the beginning of alphabet");
        }
    }
}
