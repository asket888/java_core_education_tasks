package by.asket888.java.task2.collections.calculations.lists;

import java.util.ArrayList;

public class ArrayListSpeed {

    // Declare new ArrayList collection which consists of String elements
    ArrayList<Integer> arrayList = new ArrayList<>();

    // Create private method which calculates time of filling collection by 10000 elements
    private long calculateFillTime() {
        // Clear arrayList before new iteration otherwise new elements will be added to previous additions
        arrayList.clear();
        // Start time calculation
        long startFill = System.nanoTime();
        // Create loop for addition 10000 elements to arrayList
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        // End time calculation
        long finishFill = System.nanoTime();
        // Calculate loop working time and convert result in microseconds
        long fillTime = (finishFill - startFill)/1000;
        // return final result
        return fillTime;
    }

    // Create public method which returns result of private calculateFillTime method
    public long getFillTime() {return calculateFillTime();}

    // Create private method which calculates time of addition new element to created collection
    private long calculateAddTime() {

        calculateFillTime();

        int addVar = (int) (Math.random()*10000);

        long startSearch = System.nanoTime();
        arrayList.add(addVar, 10001);

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
        arrayList.contains(getVar);

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
        arrayList.remove(removeVar);

        long finishRemove = System.nanoTime();
        long removeTime = (finishRemove - startRemove)/1000;

        return removeTime;
    }

    // Create public method which returns result of private calculateRemoveTime method
    public long getRemoveTime() {return calculateRemoveTime();}
}
