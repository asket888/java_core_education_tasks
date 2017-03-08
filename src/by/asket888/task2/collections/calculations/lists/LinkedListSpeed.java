package by.asket888.java.task2.collections.calculations.lists;

import java.util.LinkedList;

public class LinkedListSpeed {

    // Declare new LinkedList collection which consists of String elements
    LinkedList<Integer> linkedList = new LinkedList<>();

    // Create private method which calculates time of filling collection by 10000 elements
    private long calculateFillTime() {

        linkedList.clear();

        long startFill = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        long finishFill = System.nanoTime();
        long fillTime = (finishFill - startFill)/1000;

        return fillTime;
    }

    // Create public method which returns result of private calculateFillTime method
    public long getFillTime() {return calculateFillTime();}

    // Create private method which calculates time of addition new element to created collection
    private long calculateAddTime() {

        calculateFillTime();

        int addVar = (int) (Math.random()*10000);

        long startSearch = System.nanoTime();
        linkedList.add(addVar, 10001);

        long finishSearch = System.nanoTime();
        long addTime = (finishSearch - startSearch)/1000;

        return addTime;
    }

    // Create public method which returns result of private calculateAddTime method
    public long getAddTime() {return calculateAddTime();}

    // Create private method which calculates time of searching new element in created collection
    private long calculateSearchTime() {

        calculateFillTime();

        int getVar = (int) (Math.random()*10000);

        long startSearch = System.nanoTime();
        linkedList.contains(getVar);

        long finishSearch = System.nanoTime();
        long searchTime = (finishSearch - startSearch)/1000;

        return searchTime;
    }

    // Create public method which returns result of private calculateSearchTime method
    public long getSearchTime() {return calculateSearchTime();}

    // Create private method which calculates time of removal new element from created collection
    private long calculateRemoveTime() {

        calculateFillTime();

        int removeVar = (int) (Math.random()*10000);

        long startRemove = System.nanoTime();
        linkedList.remove(removeVar);

        long finishRemove = System.nanoTime();
        long removeTime = (finishRemove - startRemove)/1000;

        return removeTime;
    }

    // Create public method which returns result of private calculateRemoveTime method
    public long getRemoveTime() {return calculateRemoveTime();}
}
