package Exercise7;
// Перегрузка метода с переменным числом аргументов
// и неопределенность в выборе перегруженной версии.
//
// В этой программе имеется ошибка, и
// поэтому она не будет компилироваться.
/*
public class VarArgs4 {
    // Использование списка аргументов переменной длины типа int
    static void vaTest(int ... v){
        // ...
    }
    // Использование списка аргументов переменной длины типа boolean
    static void vaTest(boolean ... v){
        // . . .
    }
    public static void main (String [] args){
        vaTest(1,2,3); //ok
        vaTest(true, false, false); //ok
        vaTest(); //ошибка: неопределенность вызова
    }
}
*/