package Lesson10;

public class TwoDinentionalShape {

    private double width;
    private double height;

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
