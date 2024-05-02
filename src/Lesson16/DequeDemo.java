package Lesson16;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> IntegerDeque = new LinkedBlockingDeque<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 ?
                    IntegerDeque.offerLast(i) :
                    IntegerDeque.offerFirst(i))
                System.out.println("the integerDeque is not yet full and "
                        + i + " was inserted");
            else System.out.println("the IntegerDeque is full");
        }

        for (Integer i : IntegerDeque) {
            System.out.println(i + " ");
        }
    }
}
