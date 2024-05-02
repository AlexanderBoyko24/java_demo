package Chaper14.LambdaExceptions;

public class LambdaExceptionDemo {
    public static void main(String[] args) {

        double[] values = {1.0, 2.0, 3.0, 4.0};

        // Данное блочное лямбда-выражение может генерировать
// исключение IOException. Следовательно, это исключение
// должно быть указано в операторе throws метода
// ioAction() функционального интерфейса MyIOAction.
        MyIOAction myIo = (rdr)-> {   //данное nямбдa-аырожениеможетrенерировотьискnючение
          int ch = rdr.read();// может генерировать
                                // исключение IOException
            return true;
        };
    }
}
