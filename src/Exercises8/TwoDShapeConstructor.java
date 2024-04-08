package Exercises8;
// Добавление конструктора в класс Triangle.

class TwoDShapeConstructor {
    private double width;
    private double height;

    // Методы доступа к переменным экземпляра width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height - " + width + " and" + height);
    }
}

// Подкласс для представления треугольников,
// производный: от класса TwoDShape

class TriangleConsctr extends TwoDShapeConstructor {
    private String style;

    // Конструктор
    TriangleConsctr(String s, double w, double h) {
        setWidth(w);
        setHeight(h); //Инициализация части объекта, соответствующей части TwoDShapeConstructor

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shape3 {
    public static void main(String[] args) {
        TriangleConsctr t1 = new TriangleConsctr("Закрашенный", 4.0, 4.0);
        TriangleConsctr t2 = new TriangleConsctr("Контурный", 8.0, 12.0);

        System.out.println("Info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());

        System.out.println("---------------");

        System.out.println("Info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
    }
}