package Exercise3;

public class CASTDemo {
    public static void main (String [] args){
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("Целочисленный результат деления x / y: "  + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Значение b: " + b);
        //не сработает, потому что байт не может содержать значение 257

        b = 100;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}