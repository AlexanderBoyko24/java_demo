package Exercises10;

public class ExcDemo2 {
    public static void main (String [] args){
         try{
             ExcTest.genException();
         }
        // А здесь исключение перехватывается
        catch (ArrayIndexOutOfBoundsException exc){ // здесь исключение перехватывается
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");
    }
}
