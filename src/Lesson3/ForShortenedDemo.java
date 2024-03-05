package Lesson3;

public class ForShortenedDemo {
    public static void main (String [] args){
        int i =0;

        for (; i < 10;){
            System.out.println("Run #" + i);
                        i++;

        }
        int sum = 0;
        for (i = 1; i <= 5; sum += i++);
            System.out.println("sum = " + sum);
    }
}
