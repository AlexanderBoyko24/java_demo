package Exercises8;

// Многоуровневая иерархия
class TwoDShape1{
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape1(){
        width=height=0.0;
    }
    // Параметризированный конструктор
    TwoDShape1(double w, double h){
        width = w;
        height = h;
    }

    // Создать объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape1(double x){
        width=height=x;
    }

    // Методы доступа к переменным экземпляра width и height
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width =w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Width and height - " + width + " " + height);
    }
}

// Расширение класса TwoDShape
class Triangle1 extends TwoDShape1{
    private String style;

    // Конструктор по умолчанию
    Triangle1(){
        super();
        style = "none";
    }
    Triangle1(String s, double w, double h){
        super(w,h);// вызвать конструктор суперкласса
        style =s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle1(double x){
        super(x);// вызвать конструктор суперкласса
        style = "contoured";
    }
    double area(){
        return getHeight()*getWidth()/2;
    }
    void showStyle(){
        System.out.println("Triangle " + style);
    }
}
// Расширение класса Triangle
class ColorTriangle extends Triangle1{
    //класс ColorTriangle наследует класс Triangle1
    //производный от класса  TwoDShape1,
    //и поэтому включает все членый классов  Triangle1 и TwoDShape1
    private String color;

    ColorTriangle(String c, String s, double w, double h){
        super(s,w,h);
        color = c;
    }

    String getColor(){return color;}

    void showColor(){
        System.out.println("Color -" + color);
    }
}

 class Shape6 {
    public static void main (String [] args){
        ColorTriangle t1 = new ColorTriangle("blue","contour", 8.0,12.0);
        ColorTriangle t2 = new ColorTriangle("red", "colored", 2.0,2.0);

        System.out.println("Info about t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area - " + t1.area());

        System.out.println("----------------");

        System.out.println("Info about t2: ");
        t2.showStyle();
        t2.showDim(); //объект типа ColorTriangle может вызывать как собственные методы, так и методы суперклассов
        t2.showColor();
        System.out.println("Area - " + t2.area());

        System.out.println("----------------");

    }
}
