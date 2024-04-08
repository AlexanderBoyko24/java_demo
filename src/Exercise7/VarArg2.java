package Exercise7;
/*Помимо списка параметров переменной длины, в объявлении метода могут указываться
и обычные параметры, но при одном условии: массив параметров переменной
длины должен быть указан последним. Например, приведенное ниже объявление метода
является вполне допустимым.
int doit(int а, int Ь, douЫe с, int ... vals) {
public class VarArg2 {
}
*/

class VarArg2{

    // Здесь msg - обычный параметр,
// а v - массив параметров переменной длины

    static void vaTest(String msg, int... v){
        System.out.println(msg +v.length);
        System.out.println("Содержимое");

        for (int i= 0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }
    public static void main (String [] args){
        vaTest("Один аргумент в массиве: ", 10);
        vaTest("Tpи аргумента в массиве: ", 1, 2, 3);
       vaTest("Отсутствуют аргументы в виде массива: ");
    }
}