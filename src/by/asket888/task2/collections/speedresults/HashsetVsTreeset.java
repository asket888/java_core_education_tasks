package by.asket888.java.task2.collections.speedresults;

import by.asket888.java.task2.collections.calculations.sets.HashSetAverageSpeed;
import by.asket888.java.task2.collections.calculations.sets.TreeSetAverageSpeed;

/** TASK 2.2:
 *  Check the speed of HashSet and TreeSet collections */

public class HashsetVsTreeset {

    public static void main(String[] args) {

        // Create new Object of HashSetAverageSpeed Class
        HashSetAverageSpeed hashSet = new HashSetAverageSpeed();
        // Create new Object of TreeSetAverageSpeed Class
        TreeSetAverageSpeed treeSet = new TreeSetAverageSpeed();

        // Call method which calculate filling time of 10000 Elements in both Objects
        hashSet.averageFillTime();
        treeSet.averageFillTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate addition time of one Elements in both Objects
        hashSet.averageAddTime();
        treeSet.averageAddTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate search time of one Elements in both Objects
        hashSet.averageSearchTime();
        treeSet.averageSearchTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate remove time of one Elements in both Objects
        hashSet.averageRemoveTime();
        treeSet.averageRemoveTime();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
