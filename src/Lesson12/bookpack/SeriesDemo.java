package Lesson12.bookpack;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        ByThrees ob2 = new ByThrees();

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
    }


    public static void showSeries(int x, Series ser) {
        for (int i = 0; i < x; i++) {
            System.out.println("next value: " + ser.getNext());
        }
    }
}
