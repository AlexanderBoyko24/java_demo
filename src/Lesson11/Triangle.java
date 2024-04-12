package Lesson11;

public class Triangle extends TwoDimensionShape {

    private String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w,h,"triangle");
        style =s;
    }
    Triangle(double x){
        super(x, "triangle");
        style = "colored";
    }
    Triangle(Triangle obj){
        super(obj);
        style = obj.style;
    }

    @Override
    double areaCalc() {
        return getWidth()*getHeight()/2;
    }
}
