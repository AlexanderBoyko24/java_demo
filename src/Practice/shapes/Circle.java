package Practice.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Площадь круга
    }

    // Метод displayInfo() уже реализован по умолчанию в интерфейсе

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        // Вызов метода calculateArea() для вычисления площади круга
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Вызов метода displayInfo() для вывода информации о круге
        circle.displayInfo();

        // Вызов статического метода getNumberOfCorners() через интерфейс Shape
        int corners = Shape.getNumberOfCorners();
        System.out.println("Number of corners: " + corners);
    }
}
