package Lesson14;

import java.io.IOException;

public class ThrowsDemo {
    public static char prompt(String str) throws IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Enter a letter ");
        }catch (IOException e){
            System.out.println("input-Output exception has occurred");
            ch='X';
        }
        System.out.println("You have pressed " + ch);
    }
}
