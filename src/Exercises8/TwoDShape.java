package Exercises8;

//class имя подкласса extends имя_суперкласса {
// тело класса
//}
class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Ширина и высота - " + width + "and" + height);

    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("triangle " + style);
    }
}

class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }
}

    class Shape {
        public static void main(String[] args) {
            Triangle t1 = new Triangle();
            Triangle t2 = new Triangle();
            Rectangle r1 = new Rectangle();
            t1.width = 4.0;
            t1.height = 4.0;
            t1.style = "coloured";

            t2.width = 4.0;
            t2.height = 4.0;
            t2.style = "countered";

            r1.height = 2;
            r1.width = 3;

            System.out.println("Info about t1: ");
            t1.showStyle();
            t1.showDim();
            System.out.println("Area - " + t1.area());

            System.out.println("----------------------");

            System.out.println("Info about t2: ");
            t2.showStyle();
            t2.showDim();
            System.out.println("Area - " + t2.area());

            System.out.println("-----------------------");

            System.out.println("Info about r1: ");
            r1.area();
            r1.isSquare();
            System.out.println("Area - " + r1.area());
            System.out.println("Is Square - " + r1.isSquare());
        }
    }
