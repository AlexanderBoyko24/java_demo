package Practice.String;

public class Stringmethods2 {
    public static void main (String [] args){

        String name = "Alex";
        int age = 32;

        int x = 3;
        int y = 4;

       int z=  add(x,y);
        System.out.println(z);

        hello(name, age);

    }
    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y){
        int z = x+y;
        return z;
    }

}
