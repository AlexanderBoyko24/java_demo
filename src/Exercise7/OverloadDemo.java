package Exercise7;
// Перегрузка методов

class OverLoad {
    void ovlDemo() {
        System.out.println("No parameters");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }

}


class OverloadDemo {
    public static void main(String[] args) {

        OverLoad ob = new OverLoad();
        int resI;
        double resD;

        // Поочередно вызвать все версии метода ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4,6): " + resI);

        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.32): " + resD);

    }
}

/*тип возвращаемого значения не
учитывается при перегрузке методов. Следовательно, попытка определить два варианта
метода ovlDemo () так, как показано ниже, приводит к ошибке.*/