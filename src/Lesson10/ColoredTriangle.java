package Lesson10;

public class ColoredTriangle extends Triangle {
    private String colour;

    ColoredTriangle(String colour, String style, double width, double height) {
        super(style, width, height);
        this.colour = colour;
    }

    String getColour() {
        return colour;
    }

    void showColour(){
        System.out.println("Colour is " + colour);
    }
}