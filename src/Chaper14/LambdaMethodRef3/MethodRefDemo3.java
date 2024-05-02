package Chaper14.LambdaMethodRef3;

// Использование ссылки на метод экземпляра для обращения
// к любому интерфейсу.
 class MethodRefDemo3 {
     public static void main (String [] args){
         boolean result;

         MyIntNum myNum = new MyIntNum(12);
         MyIntNum myNum2 = new MyIntNum(16);

         // Создать ссылку inp на экземплярный метод isFactor{)
         MyIntNumPredicate inp = MyIntNum::isFactor; //ссылка на метод любого объекта
                                                    // типа MyInt num

         // Вызвать метод isFactor () для объекта myNum
         result = inp.test(myNum,3);
         if (result) System.out.println("3 is a divider of " + myNum.getNum());

         // Вызвать метод isFactor() для объекта myNum2
         result = inp.test(myNum2,3);
         if (!result) System.out.println("3 is not a divider of " + myNum2.getNum());
     }
}
