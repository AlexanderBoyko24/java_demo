package Exercises8;

class TwoDShape7{
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape7(){
        width=height=0.0;
    }

    // Параметризированный конструктор
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
}
    // Создать объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape7(double х) {
        width = height = х;
    }

    // Создать один объект на основе другого
    TwoDShape7 ( TwoDShape7 ob) {//Соэдоть один объект на основе дpyroro
        width = ob.width;
        height = ob.height;
    }
    
    // Методы доступа к переменным экземпляра width и height
    double getWidth() { return width; }
    double getHeight () { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) {height = h;}
        void showDim() {
            System.out.println("Шиpинa и высота - " + width + " и " + height);
        }
    }

// Подкласс для представления треугольников,
// производный от класса TwoDShape7
class Triangle7 extends TwoDShape7 {
    private String style;

    // Конструктор по умолчанию
    Triangle7() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle
    Triangle7(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle7(double x) {
        super(x); // вызвать конструктор суперкласса
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle7(Triangle7 ob) {
        super(ob); // передача объекта конструктору класса TwoDShape//передать ссылку на объект Triangle конструктору класса TwoDShape7
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Tpeyгoльник " + style);
    }
}

 class Shape7 {
     public static void main(String[] args) {
         Triangle7 t1 = new Triangle7("контурный", 8.0, 12.0);

         // создать копию объекта t1
         Triangle7 t2 = new Triangle7(t1);

         System.out.println("Info about t1:");
         t1.showStyle();
         t1.showDim();
         System.out.println("Area - " + t1.area());
         System.out.println("----------------");

         System.out.println("Info about t2:");
         t2.showStyle();
         t2.showDim();
         System.out.println("Area - " + t2.area());
         System.out.println("----------------");
     }
 }

