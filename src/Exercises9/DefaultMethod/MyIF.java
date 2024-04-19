package Exercises9.DefaultMethod;
// чтобы объявить метод как дефолтный в интерфейсе Java, используется ключевое слово default перед сигнатурой метода.


public interface MyIF {
    // Объявление "обычного" метода интерфейса, которое НЕ включает
// определение реализации по умолчанию

    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }
        // Объявление статического метода интерфейса
        static int getUniversalID() {
            return 15;
        }
    }