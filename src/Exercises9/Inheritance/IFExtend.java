package Exercises9.Inheritance;

public class IFExtend {
    public static void main (String [] args){
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
/*в каждом классе, реализующем интерфейс, должны быть определены все методы, объявленные в
интерфейсе, в том числе те, которые были унаследованы от других интерфейсов.*/