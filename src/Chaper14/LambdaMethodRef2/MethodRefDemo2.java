package Chaper14.LambdaMethodRef2;

public class MethodRefDemo2 {
    public static void main (String [] args){
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Создать ссылку ip на метод isFactor объекта myNum
        IntPredicate ip = myNum::isFactor;//ссылка на метод экземпляра

        // Использовать ссылку для вызова метода isFactor()
// через метод test()
        result = ip.test(3);
        if (result) System.out.println("3 is a divider " + myNum.getNum());

        // Создать ссылку на метод isFactor для объекта myNum2
// и использовать ее для вызова метода isFactor()
// через метод test()
        ip = myNum2::isFactor;//ссылка на метод экземпляра
        result = ip.test(3);
        if (!result) System.out.println("3 is not a divider " + myNum2.getNum());
    }
}
