package Lesson11;

public abstract class TwoDimensionShape {
    private double width;
    private double height;
    private String name;

    TwoDimensionShape(){
        width = height = 0.0;
        name = "none";
    }

    TwoDimensionShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDimensionShape(double x, String n){
        width = height = x;
        name = n;
    }

    public TwoDimensionShape(TwoDimensionShape obj) {
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

   public String getName(){return name;}
    double getWidth(){return width;}
    double getHeight(){return  height;}
    void setWidth(double width){this.width = width;}
    void setHeight(double height){this.height = height;}

   public void showDimensions(){
        System.out.println("Width and height: " + width + " & " + height);
    }

    abstract double areaCalc();
}
