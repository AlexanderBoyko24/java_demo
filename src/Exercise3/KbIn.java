package Exercise3;

import java.io.IOException;

public class KbIn {
    public static void main (String [] args) throws IOException {

            char ch;
            System.out.println("Press any key then press Enter: ");

            ch = (char) System.in.read();

            System.out.println("You pressed the key " + ch);
        }
    }

