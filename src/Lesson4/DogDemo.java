package Lesson4;

public class DogDemo {
    public static void main (String [] args){
        Dog myDog0 = new Dog();
        Dog myDog1 = new Dog("black", 10,"labrador", true,"Margater");
        Dog myDog2 = new Dog("white", 2,"labrador", false,"Mark");
        Dog myDog3 = new Dog("Polly");

        myDog0.printDogInfo();
        myDog1.printDogInfo();
        myDog2.printDogInfo();
        myDog3.printDogInfo();

    }
}
