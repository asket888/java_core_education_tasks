package by.asket888.java.task2.collections.calculations.maps;

public class HashMapAverageSpeed {

    // Create new Object of HashMapSpeed Class
    HashMapSpeed hashMapSpeed = new HashMapSpeed();

    // Create public method which calculates average time of 10000 collection fillings
    public void averageFillTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashMapSpeed.getFillTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of filling HashMap collection by 10000 of elements is " + result
                + " microseconds");
    }

    // Create public method which calculates average time of addition new element to created collection
    public void averageAddTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashMapSpeed.getAddTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ / averageTime.length);
        System.out.println("Average time of addition element to HashMap collection is " + result + " microseconds");
    }

    // Create public method which calculates average time of searching an element in created collection
    public void averageSearchTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashMapSpeed.getSearchTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of searching element in HashMap collection is " + result + " microseconds");
    }

    // Create public method which calculates average time of remove an element in created collection
    public void averageRemoveTime() {

        long[] averageTime = new long[1000];
        for (int i = 0; i < averageTime.length; i++) {
            averageTime[i] = hashMapSpeed.getRemoveTime();
        }
        double summ = 0;
        for (int j = 0; j < averageTime.length; j++) {
            summ += averageTime[j];
        }
        String result = String.format("%.2f", summ/averageTime.length);
        System.out.println("Average time of removal element from HashMap collection is " + result + " microseconds");
    }
}
