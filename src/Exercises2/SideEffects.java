package Exercises2;

public class SideEffects {
    public static void main (String [] args){
        int i;

        i = 0;
        if (false & (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("операто if выполняется: " + i);

        // В обычном логическом опероторе мы проверяем оба операнда. Получается, что теперь у i значение будет 1.
        // И теперь происходит переход к следующему if, со значением i = 1 ?

        if (false && (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("операто if выполняется: " + i);
        // второй операнд не проверяется, тк.у первого значение false
        // соответственно, значение i  остается 1

    }
}
