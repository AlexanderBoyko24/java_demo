package Exercise7;

// Добавление версии метода f(byte)
class Overload3{
    void f(byte x){
        System.out.println("inside f(byte): " + x);
    }

    void f(int x){
        System.out.println("inside f(int): " + x);
    }

    void f(double x){
        System.out.println("Inside f(double): " + x);
    }
}

public class TypeConv2 {
    public static void main (String [] args){
        Overload3 ob = new Overload3();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); //вызов метода ob.f(int)
        ob.f(d);//вызов метода ob.f(double)
        ob.f(b);//вызов метода ob.f(byte) без преобразхования типов
        ob.f(s);//вызов метода ob.f(int) с преобразованием типов
        ob.f(f);//вызов метода ob.f(double) с преобразованием типов
    }
}
