package Lesson10;

public class Triangle extends TwoDimensionalShape {

    String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(double x) {
        super(x);
        style = "colored";
    }

    Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }


    Triangle(Triangle prototype) {
        super(prototype);
        style = prototype.style;
    }

    double areaCalc() {
        return getHeight( ) * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Style is " + style);
    }

    @Override
    void showDimensions() {
        System.out.println(style);
    }
}
