package Chaper14.Lambda3param;

// Использование одного и того же функционального интерфейса
//с тремя различными лямбда-выражениями.
public class LambdaDemo2 {
    public static void main(String[] args) {

// Данное лямбда-выражение проверяет, кратно ли одно число другому
        Numerictest isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 is divider of 10");
        if (!isFactor.test(10, 3))
            System.out.println("3 is not a divider of 10");
        System.out.println();

        // Данное лямбда-выражение возвращает true, если
// первый аргумент меньше второго
        Numerictest lessThan = (n, m) -> (n < m);

        if (lessThan.test(2, 10))
            System.out.println("2 is less than 10");
        if (!lessThan.test(10, 2))
            System.out.println("10 is not less than 2");

        // Данное лямбда-выражение возвращает true, если оба
// аргумента равны по абсолютной величине
        Numerictest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if (absEqual.test(4,-4))
            System.out.println("Absolute values 4 and - 4 are equal");
        if (!absEqual.test(4,-5))
            System.out.println("Absolute values 4 and - 5 are not equal");
        System.out.println();
    }
}
//используется один и тот же интерфейс с тремя разными лямбда-выражениями