package Exercises10.Throw;

public class ThrowDemo {
    public static void main (String [] args){
        try{
            System.out.println("До оператора throw");
            throw  new ArithmeticException(); // сгенерировать исключение
        }
        catch (ArithmeticException exc){
            //перехватить исключение
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch");
    }
}
