package Exercises9.DefaultMethod;
// Реализация интерфейса MyIF

class MyIFImp  implements  MyIF{
    // Реализации подлежит лишь метод getUserID() интерфейса MyIF.
// Делать это для метода getAdminID() необязательно, поскольку
    // при необходимости может быть использована его реализация,
// заданная по умолчанию.

    public int getUserID(){
        return 100;
    }
}
