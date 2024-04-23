package Practice.ForEach;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main (String [] args){

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("rat");

        for (String i : animals){
            System.out.println(i);
        }
    }
}
