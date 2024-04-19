package Exercises9.DefaultMethod;

// Использование интерфейсного метода по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // Вызов метода getUserID() возможен, поскольку он явно
// реализован классом MyIFimp
        System.out.println("User ID: " + obj.getUserID());

        // Вызов метода getAdminID() также возможен, поскольку
// предоставляется его реализация по умолчанию
        System.out.println("Admin ID: " + obj.getAdminID());

        MyIFImp2 obj2 = new MyIFImp2();
        System.out.println("-----------------------");
        System.out.println("User ID: " + obj2.getUserID());
        System.out.println("Admin ID: " + obj2.getAdminID());
        System.out.println("-----------------------");
        //Для вызова статического метода  следует указать его имя интерфейса,
        // а после него, используя точечную нотацию, имя самого метода.
         int getUniversalID = MyIF.getUniversalID();
        System.out.println("Universal ID: " +  MyIF.getUniversalID());
    }
}
