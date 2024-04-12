package Exercises8;

// Использование динамической диспетчеризации методов
class TwoDShape5 {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    TwoDShape5() {
        width = height = 0.0;
        name = "none";
    }

    // Параметризированный конструктор
    TwoDShape5(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

 // Создать объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape5(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создать один объект на основе другого
    TwoDShape5(TwoDShape5 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа к переменным экземпляра width и height
    double getWidth() { return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    String getName() {return name;}

    void showDim() {
        System.out.println("Width and height - " + width + " and " + height);
    }

    double area() { //Метод area () опредепен в кпоссе TwoDShape5
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape5
class Triangle5 extends TwoDShape5 {
    private String style;

    // Конструктор по умолчанию
    Triangle5() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle5
    Triangle5(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle5(double x) {
        super(x, "triangle");// вызвать конструктор суперкласса

        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle5(Triangle5 ob) {
        super(ob);// передать объект конструктору класса TwoDShape
        style = ob.style;
    }

    // Переопределение метода area() для класса Triangle
    double area() { //Переопределить метод area () дпя кпассо Triangle5
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
class Rectangle5 extends TwoDShape5 {

    // Конструктор по умолчанию
    Rectangle5() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle5(double w, double h) {
        super(w, h, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать квадрат
    Rectangle5(double x) {
        super(x, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать один объект на основе другого
    Rectangle5(Rectangle5 ob) {
        super(ob);// передать объект конструктору класса TwoDShape
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Переопределение метода area() для класса Rectangle
    double area() { //Переоnределить метод area () для класса Rectangle5
        return getWidth() * getHeight();
    }
}

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape5 shapes[] = new TwoDShape5[5];
        shapes[0] = new Triangle5("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle5(10);
        shapes[2] = new Rectangle5(10, 4);
        shapes[3] = new Triangle5(7.0);
        shapes[4] = new TwoDShape5(10, 20, "фигура");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площать - " + shapes[i].area());
            System.out.println();
//нужная версия метода area() вызывается для каждой геометрической фигуры по отдельности
        }
    }
}
