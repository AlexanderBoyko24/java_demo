package Lesson15;

import Lesson13.Queue;
import Lesson14.Dog;

public class QueueDemo {
    public static void main(String[] args) throws Exercises9.Queue.QueueFullException {
        char[] name = {'T', 'o', 'm'};

        FixedQueue bigQ = new FixedQueue(100);
        FixedQueue smallQ = new FixedQueue(4);
        DynamicQueue dynQueueObj = new DynamicQueue(5);
        CircularQueue circQueueObj = new CircularQueue(10);
        FixedQueue arrayBasedQueueObj = new FixedQueue(name);
        char ch;
        int i;

        InterfaceCharQueue interfaceTypeObj;
        InterfaceCharQueue[] queues = {bigQ, smallQ, dynQueueObj, circQueueObj, arrayBasedQueueObj};

        int nr = 1;
        for (InterfaceCharQueue q : queues) {
            System.out.println("\nExample: " + nr);
            interfaceTypeObj = q;
            putMultipleCharacters(interfaceTypeObj, 26);
            getMultipleCharacters(interfaceTypeObj, 26);
            try {
                putAndGetMultipleCharacters(interfaceTypeObj, 26);
            } catch (QueuelEmptyException | QueueFullException e) {
                e.printStackTrace();
            }
            nr++;
        }
    }

    static void putMultipleCharacters(InterfaceCharQueue obj, int num) {
        System.out.println("\nPutting " + num + " " +
                "characters into " + obj.getClass() + ": ");
        for (int i = 0; i < num; i++) {
            try {
                obj.put((char) ('A' + i));
            } catch (QueueFullException e) {
                e.printStackTrace();
            } catch (Exercises9.Queue.QueueFullException e) {
                e.printStackTrace();
            }
        }
    }

    static void getMultipleCharacters(InterfaceCharQueue obj, int num) {
        System.out.println("\nGetting " + num + " " +
                "characters from " + obj.getClass() + ": ");
        for (int i = 0; i < num; i++) {
            char ch = 0;
            try {
                ch = obj.get();
            } catch (QueuelEmptyException e) {
                e.printStackTrace();
            }
            if (ch != (char) 0) System.out.print(ch);
        }
    }

    static void putAndGetMultipleCharacters(InterfaceCharQueue obj, int num) throws QueueFullException, Exercises9.Queue.QueueFullException, QueuelEmptyException {
        System.out.println("\nPutting  and getting " + num + " " +
                "characters into " + obj.getClass() + ": ");
        for (int i = 0; i < num; i++) {
            obj.put((char) ('A' + i));
            char ch = obj.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
