package Chaper14.LambdaMethodRef3;

// Функциональный интерфейс для числовых предикатов, которые
// воздействуют на объект типа MyintNurn и целочисленное значение

public interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}
