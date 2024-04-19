package Exercises9.series;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos2 twoOb = new ByTwos2();
        ByThrees2 threeOb = new ByThrees2();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next value of ByTwos2: " + ob.getNext());//доступ к объекту по интерфейсной ссылке

            ob = threeOb;
            System.out.println("Next value of ByThrees2: " + ob.getNext());//доступ к объекту по интерфейсной ссылке
        }
    }
}
