package Lesson4;

public class NestedLoops {
    public static void main (String [] args){


        for (int i = 0; i < 3; i++){
            System.out.println("Outer loop counter " + i);
            System.out.print("Inner loop counter: ");

            int t = 0;
            while (t < 100){
                if (t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("All loops are completed.");
    }
}
