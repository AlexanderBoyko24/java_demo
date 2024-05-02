package Chaper14.LambdaVarCatch;

 class VarCapture {
     public static void main (String [] args){

         // локальная переменная, которая может быть захвачена
         int num = 10;

         MyFunc myLambda = (n)-> {
             // Такое использование переменной num корректно, поскольку
// ее значения не изменяется
             int v = num +n;

             // Приведенная ниже инструкция некорректна,
// поскольку она изменяет значение переменной num
             // num++;

             return  v;
         };
         // Использование лямбды. Эта инструкция отобразит число 18.
         System.out.println(myLambda.func(8));

         // Приведенная ниже строка породила бы ошибку, поскольку она
// лишает num статуса финальной переменной
        // num = 9;
     }
}