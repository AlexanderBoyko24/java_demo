package Chapter13.Interface;

public class GenIFDemo {
    public static void main (String [] args){
        Integer x[] = {1,2,3};

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if (ob.contains(2))
            System.out.println("2 is contained in ob");
        else
            System.out.println("2 is not contained in ob");

        if (ob.contains(5))
            System.out.println("5 is contained in ob");
        else
            System.out.println("5 is not contained in ob");

        // Следующие строки кода недопустимы, так как объект оЬ
// является вариантом реализации интерфейса Containment для
// типа Integer, а значение 9.25 относится к типу Double.
// if(ob.contains(9.25)) // Недопустимо!
// System.out.println("9.25 не содержится в оЬ");
    }
}
