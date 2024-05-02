package Chapter13.NumericFns;

// В этой версии класса NumericFns аргументом типа,
// заменяющим параметр типа Т, должен стать класс NurnЬer
// или производный от него подкласс, как показано ниже.
public class NumericFns<T extends Number> {
    T num;

    // Передать конструктору ссылку на числовой объект
    NumericFns(T n) {
        num = n;
    }

    // Вернуть обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Вернуть дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}