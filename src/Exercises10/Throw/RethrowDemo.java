package Exercises10.Throw;

public class RethrowDemo {
    public static void main (String [] args){
        try{
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            // Повторно перехватить исключение
            System.out.println("Фатальная ошибка - " + "выполнение программы прервано!");
        }
    }
}
