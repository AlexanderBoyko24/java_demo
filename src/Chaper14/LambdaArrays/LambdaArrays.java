package Chaper14.LambdaArrays;

 class LambdaArrays {
     public static void main (String [] args){

         MyTransform<Double> sqrts = (v) -> {
             for (int i=0; i<v.length; i++)
                 v[i] = Math.sqrt(v[i]);
         };
         // Пример массива
         Double[] numbers = {4.0, 9.0, 16.0};

         // Применение лямбда-выражения к массиву
         sqrts.transform(numbers);

         // Вывод результата
         for (Double number : numbers) {
             System.out.println(number);
         }
     }
}
