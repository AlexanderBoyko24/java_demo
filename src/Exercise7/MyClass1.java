package Exercise7;

public class MyClass1 {
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}

class Accessdemo{
    public static void main (String [] args){
        MyClass1 ob = new MyClass1();

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        //ob.alpha = 10; - не сработает,
        // т.к альфа закрытая переменная

        ob.beta = 88;
        ob.gamma = 99;

    }
}