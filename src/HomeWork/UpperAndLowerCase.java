package HomeWork;

import java.io.IOException;

public class UpperAndLowerCase {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Для остановки нажмите символ точки");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -=32;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Изменение регистра: " + changes);
    }
}