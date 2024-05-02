package Chaper14.LambdaBlock;

// Блочное лямбда-выражение, предназначенное для нахождения
// наименьшего положительного делителя заданного целого числа

public class BlockLambdaDemo {
    public static void main (String [] args){

    // Данное блочное лямбда-выражение возвращает наименьший
// положительный делитель заданного целого числа

    //блочное лямбда-выражение
    NumericFunc smallestF = (n) -> {
        int result = 1;

        // Get absolute value of n.
        n = n < 0 ? -n : n;

        for (int i = 2; i <= n / i; i++)
            if ((n % i) == 0) {
                result = i;
                break;
            }
        return result;
    };
        System.out.println("The smallest divider of 12 is " + smallestF.func(12));
        System.out.println("The smallest divider of 11 is " + smallestF.func(11));
}
    }