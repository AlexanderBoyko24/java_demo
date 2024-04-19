package Lesson14;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    Dog(String name){
        this.name = name;
    }

    public  void putCollar(){
        System.out.println("the collar is on");
        isCollarPutOn = true;
    }
    public  void putleash() {
        System.out.println("the leash is on");
        isLeashPutOn = true;
    }
    public  void putMuzzle() {
        System.out.println("the muzzle is on");
        isMuzzlePutOn = true;
    }
    public void walk() throws DogIsNotReadyException {
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Great, let`s go for a walk " + name + "is happy");
        }else {
            throw new DogIsNotReadyException("the dog " + name + " not happy. Please check if everything is right");

        }
    }
public static void main (String [] args){
   Dog dog = new Dog("Goodboy");
   dog.putCollar();
   dog.putMuzzle();
   try{
   dog.walk();
   }catch (DogIsNotReadyException e){
       e.printStackTrace();
       System.out.println("check. " +
               "Is collar on?" + dog.isCollarPutOn +
               "\nIs leash put on?" + dog.isLeashPutOn +
               "\nIs muzzle put on? " + dog.isMuzzlePutOn);
   }
}
}

