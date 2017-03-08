package by.asket888.java.task2.collections.speedresults;

import by.asket888.java.task2.collections.calculations.maps.TreeMapAverageSpeed;
import by.asket888.java.task2.collections.calculations.maps.HashMapAverageSpeed;

/** TASK 2.2:
 *  Check the speed of HashMap and TreeMap collections */

public class HashmapVsTreemap {

    public static void main(String[] args) {

        // Create new Object of HashMapAverageSpeed Class
        HashMapAverageSpeed hashMap = new HashMapAverageSpeed();
        // Create new Object of TreeMapAverageSpeed Class
        TreeMapAverageSpeed treeMap = new TreeMapAverageSpeed();

        // Call method which calculate filling time of 10000 Elements in both Objects
        hashMap.averageFillTime();
        treeMap.averageFillTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate addition time of one Elements in both Objects
        hashMap.averageAddTime();
        treeMap.averageAddTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate search time of one Elements in both Objects
        hashMap.averageSearchTime();
        treeMap.averageSearchTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate remove time of one Elements in both Objects
        hashMap.averageRemoveTime();
        treeMap.averageRemoveTime();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
