package by.asket888.java.task2.collections.calculations.lists;

public class ArrayListAverageSpeed {

    // Create new Object of ArrayListSpeed Class
    ArrayListSpeed arrayListSpeed = new ArrayListSpeed();

    // Create public method which calculates average time of 10000 collection fillings
    public void averageFillTime() {

        // Create array averageTime for storing average values of collection filling speed
        long[] averageTime = new long[1000];
        // Create loop for add 1000 results of getFillTime method from arrayListSpeed class to array averageTime
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = arrayListSpeed.getFillTime();
        }
        // Calculate sum of all time results of getFillTime method running
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        // Calculate average result of running getFillTime method and print it in console
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of filling ArrayList collection by 10000 of elements is " + result
                + " microseconds");
    }

    // Create public method which calculates average time of addition new element to created collection
    public void averageAddTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = arrayListSpeed.getAddTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of addition element to ArrayList collection is " + result + " microseconds");
    }

    // Create public method which calculates average time of searching an element in created collection
    public void averageSearchTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = arrayListSpeed.getSearchTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of searching element in ArrayList collection is " + result + " microseconds");
    }

    // Create public method which calculates average time of remove an element in created collection
    public void averageRemoveTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = arrayListSpeed.getRemoveTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of removal element from ArrayList collection is " + result + " microseconds");
    }
}
