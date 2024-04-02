package Lesson8;

public class AccessModifiersDemo {
    public static void main (String [] args){



        Block block1 = new Block(5,6,7);
        Block block2 = new Block(5,1,7);
        System.out.println(block1.isSameBlock(block2));
        System.out.println(block1.isSameVolume(block2));
        Block block3 = block1.createDuplicate();
        System.out.println(block1.isSameBlock(block3));


    }
}
