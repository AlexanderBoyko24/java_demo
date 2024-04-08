package Exercises8;

class TwoDShapeDifConst {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShapeDifConst() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShapeDifConst(double w, double h) {
        width = w;
        height = h;
    }

    // Конструирование объекта с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShapeDifConst(double x) {
        width = height = x;
    }

    // Методы доступа к переменным экземпляра width и height
    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height - " + width + " and " + height);
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle4 extends TwoDShapeDifConst {
    private String style;

    // Конструктор по умолчанию
    Triangle4() {
        super();//вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle4(String s, double w, double h) {
        super(w, h);// вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }

    // Конструктор с 1 аргументом
    Triangle4(double x) {
        super(x);// вызвать конструктор суперкласса с одним аргументом
        style = "закрашенный";
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shape5 {
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4();
        Triangle4 t2 = new Triangle4("контурный", 8.0, 12.0);
        Triangle4 t3 = new Triangle4(4.0);

        t1 = t2;

        System.out.println("Info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());

        System.out.println("----------------");

        System.out.println("Info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());

        System.out.println("----------------");

        System.out.println("Info about t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area - " + t3.area());

        System.out.println("----------------");
    }
}