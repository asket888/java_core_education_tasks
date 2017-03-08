package by.asket888.java.task2.collections.speedresults;

import by.asket888.java.task2.collections.calculations.lists.ArrayListAverageSpeed;
import by.asket888.java.task2.collections.calculations.lists.LinkedListAverageSpeed;

/** TASK 2.2:
 *  Check the speed of Arraylist and Linkedlist collections */

public class ArraylistVsLinkedlist {

    public static void main(String[] args) {

        // Create new Object of ArrayListAverageSpeed Class
        ArrayListAverageSpeed arrayList = new ArrayListAverageSpeed();
        // Create new Object of ArrayListAverageSpeed Class
        LinkedListAverageSpeed linkedList = new LinkedListAverageSpeed();

        // Call method which calculate filling time of 10000 Elements in both Objects
        arrayList.averageFillTime();
        linkedList.averageFillTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate addition time of one Elements in both Objects
        arrayList.averageAddTime();
        linkedList.averageAddTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate search time of one Elements in both Objects
        arrayList.averageSearchTime();
        linkedList.averageSearchTime();
        System.out.println("-----------------------------------------------------------------------------------------");

        // Call method which calculate remove time of one Elements in both Objects
        arrayList.averageRemoveTime();
        linkedList.averageRemoveTime();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
