package by.asket888.java.task1.algorithmic;

import java.util.Arrays;

/** TASK 1.2:
 *  Find the second by length String in a list or array*/

public class AlgorithmicTask {

    public static void main(String[] args) {
        // 1) Declare of string array
        String[] array = {"John", "Aleksandr", "Joseph", "Valentin", "Arnold","Steve"};
        // 2) Print array to console
        System.out.println(Arrays.toString(array));
        System.out.println("***************************************************");
        // 3) Call method "findSecondByLengthElement" for declared array processing
        findSecondByLengthElement(array);
    }
    /* Create method for array data processing */
    public static String findSecondByLengthElement(String[] array) {

        // 4) Declare two integer variables
        int maxFirst = 0;
        int maxSecond = 0;
        String programMessage = null;

        // 5) Create conditions for exceptions1 checking
        switch (array.length) {
            // 6) Check condition if array consists from 1 element
            case 1: {
                programMessage = "Task can not be solved because array consists of one element";
                System.out.println(programMessage);
                break;
            }
            // 7) Check condition if array is empty
            case 0: {
                programMessage = "Task can not be solved because there are no any elements in the array";
                System.out.println(programMessage);
                break;
            }
            // 8) All other conditions (array consists from more then 1 element)
            default: {
                // 9) Search for first by length element in array
                for (int i = 0; i < array.length; i++) {
                    if (maxFirst < array[i].length()) {
                        maxFirst = array[i].length();
                    }
                }
                //10) Check condition if all elements in array have the same length
                double summ = 0;
                for (int i = 0; i < array.length; i++) {
                    summ += array[i].length();
                    if (summ/array.length == maxFirst) {
                        programMessage = "Task can not be solved because all elements of the array have identical length";
                        System.out.println(programMessage);
                    }
                }
                // 11) Search for second by length element in array
                for (int j = 0; j < array.length; j++) {
                    if (maxSecond < array[j].length() && array[j].length() != maxFirst) {
                        maxSecond = array[j].length();
                    }
                }
            }
        }
        // 12) Output all elements with same length like maxSecond element from p.11 has
        for (int elementNum = 0; elementNum < array.length; elementNum++) {
            if (array[elementNum].length() == maxSecond) {
                programMessage = "The second element by length: " +"\""+ array[elementNum] +"\"";
                System.out.println(programMessage);
            }
        }
        return programMessage;
    }
}
