package Practice.shapes;

public interface Shape {
    // Обычный метод для вычисления площади фигуры
    double calculateArea();

    // Дефолтный метод для вывода информации о фигуре
    default void displayInfo() {
        System.out.println("This is a shape.");
    }

    // Статический метод для получения количества углов у фигуры
    static int getNumberOfCorners() {
        return 0; // У фигуры не может быть углов (это заглушка для примера)
    }
}
