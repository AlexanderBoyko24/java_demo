package Chaper14.LambdaConstructorRef;

 class ConstructorRefDemo {
     public static void main (String [] args) {

         // Создать ссылку на конструктор MyClass.
// Поскольку метод func() интерфейса MyFunc принимает аргумент,
// new ссылается на параметризованный конструктор MyClass,
// а не на конструктор по умолчанию.
         MyFunc myClassCons = MyClass::new; //ссылка на конструктор

         // Создать экземпляр MyClass посредством ссылки на конструктор
         MyClass mc = myClassCons.func("Testing");


         // Использовать только что созданный экземпляр MyClass
         System.out.println("String str in mc: " + mc.getStr());
     }
}
