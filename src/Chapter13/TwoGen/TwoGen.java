package Chapter13.TwoGen;

public class TwoGen <T,V>{
    T ob1; // объявить объект типа Т
    V ob2;

   TwoGen(T o1, V o2){
       ob1 = o1;
       ob2 = o2;
   }

   void showTypes(){
       System.out.println("type T: " + ob1.getClass().getName());
       System.out.println("type v: " + ob2.getClass().getName());
   }

   T getOb1(){
       return ob1;
   }

   V getOb2(){
       return ob2;
   }
}