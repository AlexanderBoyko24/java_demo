package Exercise4;

public class DoWhile {
    public static void main (String [] args) throws java.io.IOException {

        char ch;

        do{
            System.out.print("Press required key then press Enter");
            ch = (char) System.in.read();
        } while (ch !='q');

    }
}
