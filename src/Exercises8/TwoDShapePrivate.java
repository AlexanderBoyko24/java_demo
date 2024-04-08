package Exercises8;

// Использование методов доступа для установки и
// получения значений закрытых членов.  get, set
class TwoDShapePrivate {
    private double width;
    private double height;

    // Методы доступа к закрытым переменным
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
        System.out.println("Width and height - " + width + " " + height);
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape

class TrianglePrivate extends TwoDShapePrivate {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class ShapePrivate{
    public static void main (String [] args){
        TrianglePrivate t1 = new TrianglePrivate();
        TrianglePrivate t2 = new TrianglePrivate();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашенный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

        System.out.println("Инфopмaция о t1: ");

        t1. showStyle () ;
        t1.showDim();
        System.out.println("Плoщaдь - " + t1.area());
        System.out.println("------------------");

        System.out.println("Инфopмaция о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Плoщaдь - " + t2.area());
        System.out.println("-----------------------");
    }
}