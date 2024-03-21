package Lesson7;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
    public static void main (String [] args) throws IOException {
        FileWriter myWriter = new FileWriter("Filename.txt");
        myWriter.write("File in java might be tricky!");
        myWriter.close();
        System.out.println("Successfully wrote to File!");
    }
}
