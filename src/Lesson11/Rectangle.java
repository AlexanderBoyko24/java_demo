package Lesson11;

public class Rectangle extends TwoDimensionShape{

    Rectangle(){
        super();
    }

    Rectangle(double w, double h){
        super(w, h, "rectangle");
    }
    Rectangle(double x){
        super(x, "rectangle");
    }
    boolean isSquare(){
        return getHeight() == getWidth();
    }

    @Override
    double areaCalc() {
        return getWidth()*getHeight();
    }
}
