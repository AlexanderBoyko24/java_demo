package Exercises10.NotHandled;
// Эта программа не будет работать!
public class ExcTypeMismatch {
    public static void main (String [] args){
        int nums[] = new int[4];

        try{
            System.out.println("До генерации исключения");

            // Сгенерировать исключение в связи с
// выходом индекса за границы массива
            nums[7] = 10; //Здесь rенерируется искпючение ArrayindexOutOfBoundsException
            System.out.println("Эта строка не будет отображаться");
        }
        /* Исключение, связанное с обращением за границы массива,
нельзя обработать с помощью оператора catch, в котором
указан тип исключения ArithmeticException. */
        catch (ArithmeticException exc){ //попытка перехватить указанное выше исключение
                                            // с помощью перехватчика исключений ArithmeticException
            // Перехватить исключение
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");
    }
}
