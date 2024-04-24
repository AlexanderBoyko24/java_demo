package Exercises10.ExceptionDemo;
/* Исключение может быть сгенерировано одним методом,
а перехвачено другим */
 class ExcTest {
     //Exception generation
    static void genException(){
        int nums[] = new int[4];

        System.out.println("Before exception generation");

        //Сгенерировать исключение в связи с
        // выходом индекса за границы массива

        nums[7] = 10; //Здесь rенерируется исключенне
        System.out.println("This String won`t be determined");
    }
}
