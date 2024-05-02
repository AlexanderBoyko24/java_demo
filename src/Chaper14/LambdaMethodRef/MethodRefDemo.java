package Chaper14.LambdaMethodRef;

 class MethodRefDemo {
     // В данном методе типом первого параметра является
// функциональный интерфейс. Следовательно, ему можно передать
// ссылку на любой экземпляр этого интерфейса, в том числе и на
// экземпляр, созданный посредством ссылки на метод.
     static boolean numTest(IntPredicate p, int v){
         return  p.test(v);
     }
     public static void main (String [] args){
         boolean result;

         // Здесь методу numTest() передается ссылка на метод isPrime()
         result = numTest(MyIntPredicate::isPrime, 17);
         if (result) System.out.println("17 is a prime number");

         // Здесь методу numTest() передается ссылка на метод isEven()
         result = numTest(MyIntPredicate::isEven,12);
         if (result) System.out.println("12 is an even number");

         // Здесь методу numTest() передается ссылка на метод isPositive()
         result = numTest(MyIntPredicate::isPositive,11);
         if (result) System.out.println("11 is a positive number");

         //использование ссылок на статические методы
     }
}
