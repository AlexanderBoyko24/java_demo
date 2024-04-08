package Lesson10;

public class TwoDimensionalShape {

    private double width;
    private double height;

    TwoDimensionalShape() {
        width = height = 0.0;
    }

    TwoDimensionalShape(double dim) {
        width = height = dim;
    }

    TwoDimensionalShape(double width, double height) {
        this.height = height;
        this.width = width;
    }

    TwoDimensionalShape(TwoDimensionalShape prototype) {
        width = prototype.width;
        height = prototype.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDimensions() {
        System.out.println("Width & height: " + width + " " + height);
    }
}
