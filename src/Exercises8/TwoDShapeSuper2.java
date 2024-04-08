package Exercises8;
//super (список_ параметров) ;

public class TwoDShapeSuper {
    private double width;
    private double height;

    // Параметризированный конструктор
    TwoDShapeSuper(double w, double h) {
        width = w;
        height = h;
    }

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
        width = h;
    }

    void showDim() {
        System.out.println("Width and height -  " + width + " and " + height);
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShapeSuper
class TriangleSup extends TwoDShapeSuper {
    private String style;

    TriangleSup(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shapes4{
    public static void main (String [] args){
        TriangleSup t1 = new TriangleSup("Закрашенный", 4.0, 4.0);
        TriangleSup t2 = new TriangleSup("Контурный", 8.0, 12.0);

        System.out.println("Info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());

        System.out.println("-------------------------");

        System.out.println("Info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());

        System.out.println("-------------------------");
    }
}