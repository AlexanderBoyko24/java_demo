package Lesson5;

public class ReturnDemo {
//    return;
//    return value;

    public int sum(int a, int b){

        return a + b;
   //     System.out.println("After Return");
    }
    public String sayHello(String name){
        return "hello " + name;
    }
    public int max(int x, int y){
        if (x < y){
            return y;
        } else if (x == y){
           return 0;
        } else return x;
  //      System.out.println("After Return");

    }

    public void printIfOdd(int number){
        if (number % 2 == 0){
            System.out.println("I am gonna return now");
            return;
        }
        System.out.println(number);
    }

    public static void main (String [] args){
        ReturnDemo example = new ReturnDemo();
        for (int i = 0; i < 10; i++)
            System.out.println("max is: " + example.max(5, i));

    }
}
