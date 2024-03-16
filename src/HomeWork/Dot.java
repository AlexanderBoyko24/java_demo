package HomeWork;

public class Dot {
    public static void main (String [] args) throws java.io.IOException{
        char ch;
        int space = 0;
        System.out.println("Enter Dot to stop");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') space++;
        } while (ch != '.');
        System.out.println("Spaces: " + space);
    }
}
