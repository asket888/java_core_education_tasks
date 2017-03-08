package by.asket888.java.task2.collections.calculations.sets;

public class HashSetAverageSpeed{

    // Create new Object of HashSetSpeed Class
    HashSetSpeed hashSetSpeed = new HashSetSpeed();

    // Create public method which calculates average time of 10000 collection fillings
    public void averageFillTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashSetSpeed.getFillTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of filling HashSet collection by 10000 of elements is " + result
                + " microseconds");
    }

    // Create public method which calculates average time of addition new element to created collection
    public void averageAddTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashSetSpeed.getAddTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ / averageTime.length);
        System.out.println("Average time of addition element to HashSet collection is " + result + " microseconds");
    }

    // Create public method which calculates average time of searching an element in created collection
    public void averageSearchTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashSetSpeed.getSearchTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of searching element in HashSet collection is " + result + " microseconds");
    }

    // Create public method which calculates average time of remove an element in created collection
    public void averageRemoveTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashSetSpeed.getRemoveTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of removal element from HashSet collection is " + result + " microseconds");
    }
}
