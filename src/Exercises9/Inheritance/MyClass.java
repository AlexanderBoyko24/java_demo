package Exercises9.Inheritance;
// Этот класс должен реализовать все методы,
// объявленные в интерфейсах А и В
 class MyClass implements B{
    @Override
    public void meth1() {
        System.out.println("Реализация meth1().");

    }

    @Override
    public void meth2() {
        System.out.println("Реализация meth2().");

    }

    @Override
    public void meth3() {
        System.out.println("Реализация meth3().");

    }
}
