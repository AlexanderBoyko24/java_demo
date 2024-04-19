package Exercises9.series;

public class SeriesDemo {
    public static void main (String [] args){
        ByTwos ob = new ByTwos();

        for (int i=0; i<5; i++)
            System.out.println("next value: " + ob.getNext());
        System.out.println("\nReset");

        ob.reset();
        for (int i=0; i<5; i++)
            System.out.println("next value: " + ob.getNext());

        System.out.println("\nInitial value: 100");
        ob.setStart(100);
        for (int i=0; i<5; i++)
            System.out.println("next value: " + ob.getNext());

    }
}
