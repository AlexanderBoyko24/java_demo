package Lesson3;
import java.io.IOException;
import java.util.Scanner;

public class ForDynDemo {
    public static void main (String [] args) throws IOException{
        int i;
        char result = 'a';
        for (i = 0;result!= 'M'; i++) {
            System.out.println("Run #" + i);
            Scanner input = new Scanner(System.in);
            result = input.nextLine(). charAt(0);
        }
    }
}
