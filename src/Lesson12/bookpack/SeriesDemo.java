package Lesson12.bookpack;

import Lesson6.ArrayUtils;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        ByThrees ob2 = new ByThrees();
        ByFives ob5 = new ByFives();

        showSeries(5,ob);

        System.out.println("no reset");
        ob.reset();

        showSeries(5, ob);

        System.out.println("Start value set to 100");
        ob.setStart(100);

        showSeries(5,ob);

        System.out.println("Previous value");
        System.out.println(ob.getPrevious());

        System.out.println("By Threes");

       showSeries(5,ob2);

        ArrayUtils.printArray(ob.getNextArray(10));
        ArrayUtils.printArray(ob2.getNextArray(10));
        ArrayUtils.printArray(ob5.getNextArray(10));
    }


    public static void showSeries(int x, Series ser) {
        for (int i = 0; i < x; i++) {
            System.out.println("next value: " + ser.getNext());
        }
    }
}
