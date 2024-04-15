package HomeWork;

class TwoDShapeHW {
    double radius;
    double pi;

    // Параметризированный конструктор
    TwoDShapeHW(double r, double p) {
        radius = r;
        pi = p;
    }
}

class CircleHW extends TwoDShapeHW {
    CircleHW(double r, double p) {
        super(r, p);//вызвать конструктор суперкласса
    }

    double area() {
        return radius * radius * pi;
    }
}

class ShapeHW {
    public static void main(String[] args) {
        CircleHW c1 = new CircleHW(3.5, 3.14);


        System.out.println("Area: " + c1.area());

    }
}