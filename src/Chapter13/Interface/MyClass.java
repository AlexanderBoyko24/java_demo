package Chapter13.Interface;
// Реализовать интерфейс Containment с помощью массива,
// предназначенного для хранения значений.
public class MyClass<T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] o){
        arrayRef = o;
    }



    @Override
    public boolean contains(T o) {
        for (T x : arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}
