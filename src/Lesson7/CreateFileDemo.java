package Lesson7;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main (String [] args) throws IOException {
        File myFile = new File("Filename.txt");
        if (myFile.createNewFile()){
            System.out.println("File created: " + myFile.getName());
        }else {
            System.out.println("File already exist. ");
        }
    }
}
