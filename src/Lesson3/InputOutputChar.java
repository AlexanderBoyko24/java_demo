package Lesson3;

import java.io.IOException;

public class InputOutputChar {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        System.out.println("Press any button, the press enter");
        char ch =(char) System.in.read();
        System.out.println("You have pressed "+ ch);

    }
}