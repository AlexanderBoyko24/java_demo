package Exercises8;


abstract class TwoDShape8{
    private double width;
    private double height;
    private  String name;

    // Конструктор по умолчанию
    TwoDShape8(){
        width =height =0.0;
        name = "none";
    }

    // Параметризированный конструктор
    TwoDShape8(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    // Создать объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape8(double x, String n){
        width = height = x;
        name = n;
    }

    // Создать один объект на основе другого
    TwoDShape8(TwoDShape8 ob){
        width =ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа к переменным width и height
    double getWidth(){return  width;}
    double getHeight(){return  height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height =h;}

    String getName(){return  name;}

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    // Теперь метод area() абстрактный
abstract  double area(); //Сделать метод area () абстрактным
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape

class Triangle8 extends TwoDShape8{
    private String style;

    // Конструктор по умолчанию
    Triangle8(){
        super();
        style = "none";
    }

    // Конструктор класса Triangle
    Triangle8(String s, double w, double h){
        super(w,h, "треугольник");
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle8(double x){
        super(x, "треугольник"); // вызвать конструктор суперкласса
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle8(Triangle8 ob){
        super(ob); // передать объект конструктору класса TwoDShape
        style = ob.style;
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Треугольньник " + style);
    }
}


// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
class Rectangle8 extends TwoDShape8{
    // Конструктор по умолчанию
    Rectangle8(){
        super();
    }

    // Конструктор класса Rectangle
    Rectangle8(double w, double h){
        super(w, h, "прямоугольник");// вызвать конструктор суперкласса
    }

    // Создать квадрат
    Rectangle8(double x){
        super(x, "прямоугольник");// вызвать конструктор суперкласса}
}

// Создать один объект на основе другого
    Rectangle8(Rectangle8 ob){
        super(ob);// передать объект конструктору класса TwoDShape
    }

    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth()*getHeight();
    }
}

class Absshape {
    public static void main (String [] args){
        TwoDShape8 shapes[] = new TwoDShape8[4];
        shapes[0] = new Triangle8("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10,4);
        shapes[3] = new Triangle8(7.0);

        for (int i = 0; i < shapes.length; i++){
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println("-------------------------");
        }
    }
}
