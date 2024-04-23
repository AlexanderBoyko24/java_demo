package Practice.OverLoadmethods;

public class OverloadMethod {
    public static void main (String [] args){
        //overload - methods that share the same name but have
        // different parameters
        // method name + parameters = method signature

        int x = add(1,2);
        System.out.println(x);
        int x1=add(1,2,3);
        System.out.println(x1);
        double x2 = add(1.0,2.0,3.0,4.0);
        System.out.println(x2);
    }
    static int add(int a, int b){
        System.out.println("Method1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Method2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Method3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("Method4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("Method5");
        return a+b+c;
    }
    static  double add(double a, double b, double c, double d){
        System.out.println("Method6");
        return a+b+c+d;
    }
}
