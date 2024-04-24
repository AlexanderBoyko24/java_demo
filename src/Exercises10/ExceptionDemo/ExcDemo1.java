package Exercises10.ExceptionDemo;

public class ExcDemo1 {
    public static void main (String [] args){
        int nums[] = new int[4];

        try{
            System.out.println("До генерации исключения");

            nums[0] = 10; // попытка выйти за границы массива
            System.out.println("Эта строка не будет отображаться");
        }
        catch (ArrayIndexOutOfBoundsException exc){ //перехват исключений, обуслловленных выходом
                                                    // за границы массива
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");

    }
}
