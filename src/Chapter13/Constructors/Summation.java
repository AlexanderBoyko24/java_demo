package Chapter13.Constructors;
// Использование обобщенного конструктора
public class Summation {
    private int sum;

    <T extends Number> Summation(T arg){ //обобщенный конструктор
        sum=0;

        for (int i=0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum(){
        return sum;
    }
}
