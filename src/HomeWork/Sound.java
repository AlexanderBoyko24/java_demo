package HomeWork;

public class Sound {
    public static void main(String[] args){
        double dist;

        dist = 1100 * 7.2;

        System.out.println("расстояние до места вспышки молнии " +
                "составляет " + dist + " футов");


        //допустим, я ударил в ладоши, и звук эха дошел до меня через 3 секунды//
        // соответсвенно, до скалы он дошел за 1,5 сек.//
        // если за 1 сек звук проходит 1100футов, то

        dist = 1100 * 1.5;
        System.out.println("расстояние до скалы " +
                "составляет " + dist + " футов");


        //2 ВАРИАНТ ДОМАШНЕГО ЗАДАНИЯ
        double time = 3.0;


        double soundSpeed = 1100;

          double distance = (time * soundSpeed) / 2;

        System.out.println("Расстояние до  скалы: " + distance + " футов");
    }
}
