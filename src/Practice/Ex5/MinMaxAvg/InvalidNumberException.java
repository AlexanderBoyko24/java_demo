package Practice.Ex5.MinMaxAvg;

// Создаем собственное исключение для некорректного ввода числа
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);

    }
}
